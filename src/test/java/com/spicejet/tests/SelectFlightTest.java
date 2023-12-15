package com.spicejet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.Sewrappers;
import com.spicejet.utils.Spicejetwrappers;

public class SelectFlightTest extends Sewrappers{
	
	Spicejetwrappers spicejet =new Spicejetwrappers();
	Reports report = new Reports();
	
	@Test
	
	public void selectDirectFlight()
	{
		try
		{
		 report.setTCDesc("Selecting  Direct Flights");
         launchBrowser("https://shorturl.at/mNQVW");
         spicejet.selectFlight();
         Assert.assertTrue(driver.getTitle().equals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets"));
		 System.out.println("Assertion Passed");
		Reports.reportStep("INFO","Assertion passed by title");

			System.out.println("Selecting for Direct flight was successfull");
		}
		catch(Exception ex)
		{
			System.out.println("Problem in selecting flight");

			ex.printStackTrace();
		}

	}
}
