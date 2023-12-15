package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class SelectFlightPage extends Sewrappers {
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-p1pxzi r-88pszg r-1otgn73'])[2]")
	public WebElement directFlight;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	public WebElement continuebutton;
	
	
	public void clickForDirectFlight()
	{
		waitForElement(directFlight,20);
		clickElement(directFlight);
	}
	
	public void clickContinueButton()
	{
		waitForElement(continuebutton,20);
		clickElement(continuebutton);
	}
	
	
}
