package com.spicejet.tests;

import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.Sewrappers;
import com.spicejet.utils.Spicejetwrappers;

public class LoginTest extends Sewrappers{
	
	Spicejetwrappers spicejet = new Spicejetwrappers();
	Reports report = new Reports();
	
	@Test
	
	public void loginWithValidCredentials()
	{
		try
		{
			report.setTCDesc("Validating login in spicejet with valid credentials");
			launchBrowser("https://www.spicejet.com/");
			spicejet.loginSpicejet("dharani.gsd@gmail.com", "Dharaniganesan@994");
			Reports.reportStep("Info", "Sucessfylly logged into the website");
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println("Problem while login with valid credentials");
			ex.printStackTrace();
		}
	}


}
