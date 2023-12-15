package com.spicejet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.Sewrappers;
import com.spicejet.utils.Spicejetwrappers;

public class BookingFormTest extends Sewrappers{
	
	Spicejetwrappers spicejet = new Spicejetwrappers();
	Reports report = new Reports();
	
	@Test
	public void bookingFormOfPassenger()
	{
		try
		{
			report.setTCDesc("Filling the booking form with passenger and payment information");
            launchBrowser("https://shorturl.at/mNQVW");
            spicejet.selectFlight();
            spicejet.bookingForm("Dharani", "Ganesan", "9876543210", "Guviassessment94@gmail.com", "Chennai", "Dharani", "Ganesan", "9876543210", "Vethanya", "Thiru", "9876543210");
            Assert.assertTrue(driver.getTitle().equals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets"));
   		 System.out.println("Assertion Passed");
   		Reports.reportStep("INFO","Assertion passed by title");

   			System.out.println("Successfully filled the booking form");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
//https://shorturl.at/ipBPY