package com.spicejet.tests;

import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.Sewrappers;
import com.spicejet.utils.Spicejetwrappers;

public class PaymentInfoTest extends Sewrappers {
	
		
		Spicejetwrappers spicejet = new Spicejetwrappers();
		Reports report = new Reports();
		
 @Test
 public void paymentDetails()
 {
	 try
	 {
		report.setTCDesc("Booking flight with valid payment details");

		launchBrowser("https://shorturl.at/mNQVW");
		spicejet.selectFlight();
        spicejet.bookingForm("Dharani", "Ganesan", "9876543210", "Guviassessment94@gmail.com", "Chennai", "Dharani", "Ganesan", "9876543210", "Vethanya", "Thiru", "9876543210");
        spicejet.addonPage();
        spicejet.paymentInfo("9876543210");
        Reports.reportStep("INFO", "Successfully filled the payment details");

		 
	 }
	 catch(Exception ex)
	 {
			System.out.println("Problem in filling payment details");

		 ex.printStackTrace();
	 }
 }
		

}
