package com.spicejet.tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicejet.utils.Sewrappers;
import com.spicejet.utils.Spicejetwrappers;

public class SignupTest extends Sewrappers{
	
	Spicejetwrappers spicejet = new Spicejetwrappers();
	
	@Test
	
	public void signupWithMandatoryFields()
	{
		try
		{
			launchBrowser("https://www.spicejet.com/");
			
			spicejet.signupSpicejet("MRS","Dharani", "Ganesan", "IN","June", "1997","9710729257","Guviassessment94@gmail.com", "Vethanyathiru", "Vethanyathiru");
			
        }
		catch(Exception ex)
		{
			System.out.println("Problem while signup with mandatory fields");
			ex.printStackTrace();
		}
	}
	
	

}
