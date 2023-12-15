package com.spicejet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.Sewrappers;
import com.spicejet.utils.Spicejetwrappers;

public class RoundTripTest extends Sewrappers {
	
	Spicejetwrappers spicejet = new Spicejetwrappers();
	Reports report = new Reports();
	
	@Test
	
	public void roundTripTest()
	{
		try
		{
		report.setTCDesc("Searching round Trip Flights");
        launchBrowser("https://www.spicejet.com/");
        spicejet.roundTrip("Mumbai","Bangalore");
        
        Assert.assertTrue(driver.getTitle().equals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets"));
		System.out.println("Assertion Passed");
		Reports.reportStep("INFO","Assertion passed by title");

		System.out.println("Search for Round trip flight was successfull");
        
		}
        
		catch(Exception ex)
		{
			System.out.println("Problem in searching for round trip flights");
			ex.printStackTrace();
		}
	}
	

}
