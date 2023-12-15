package com.spicejet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.Sewrappers;
import com.spicejet.utils.Spicejetwrappers;

public class OnewayTripTest extends Sewrappers{
	
	Spicejetwrappers spicejet = new Spicejetwrappers();
	Reports report = new Reports();
	@Test
	
	public void searchForonewayFlight()
	{
		try
		{
			 report.setTCDesc("Searching for oneway Trip Flights");
             launchBrowser("https://www.spicejet.com/");
             spicejet.oneWayTrip("Chennai", "Mumbai");
            Assert.assertTrue(driver.getTitle().equals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets"));
 			System.out.println("Assertion Passed");
 			Reports.reportStep("INFO","Assertion passed by title");

			System.out.println("Search for onewar trip flight was successfull");
			 
			
		}
		catch(Exception ex)
		{
			System.out.println("Problem in searching oneway Trip flight");
			ex.printStackTrace();
		}
	}
	

}
