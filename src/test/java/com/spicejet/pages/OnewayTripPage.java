package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class OnewayTripPage extends Sewrappers{
	
	@FindBy(xpath="//div[text()='From']")
	public WebElement text;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	public WebElement destText;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	public WebElement depDate;
	
	@FindBy(xpath="//div[text()='25']")
	public WebElement date;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	public WebElement passenger;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid']")
	public WebElement addpassenger;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")
	public WebElement country;
	
	@FindBy(xpath="//div[text()='INR']")
	public WebElement inr;
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	public WebElement searchflight;

	
	public void setOrigin(String city)
	{
		waitForElement(text,20);
		typeText(text,city);
	}
	
	public void setDestination(String destcity)
	{
		waitForElement(destText,20);
		typeText(destText,destcity);
	}
	
	public void clickDepatureDate()
	{
		waitForElement(depDate,20);
		clickElement(depDate);
	}
	
	public void clickDate()
	{
		waitForElement(date,10);
		clickElement(date);
	}
	
	public void clickPassenger()
	{
		waitForElement(passenger,20);
		clickElement(passenger);
	}
	
	public void addPassengersNumber()
	{
		waitForElement(addpassenger,20);
		clickElement(addpassenger);
	}
	
	public void clickCountry()
	{
		waitForElement(country,50);
		clickElement(country);
	}
	
	public void clickINR()
	{
		waitForElement(inr,50);
		clickElement(inr);
	}
	
	
	public void clickSearchFlight()
	{
		waitForElement(searchflight,20);
		clickElement(searchflight);
	}
	
	

}
