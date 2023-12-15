package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class RoundTripPage extends Sewrappers{
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73'])[2]")
	public WebElement roundtrip;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement text;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement desttext;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	public WebElement deparDate;
	
	@FindBy(xpath="//div[text()='21']")
	public WebElement selectDate;
	 
    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
    public WebElement returnDate;
	
	@FindBy(xpath="//div[text()='30']")
	public WebElement date;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	public WebElement passenger;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid']")
	public WebElement addPassenger;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")
	public WebElement country;
	
	@FindBy(xpath="//div[text()='INR']")
	public WebElement inr;
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	public WebElement searchflight;
	
	
	public void clickRoundTrip()
	{
		waitForElement(roundtrip,20);
		clickElement(roundtrip);
		
	}
	
	public void setOrigin(String city)
	{
		waitForElement(text,20);
		typeText(text,city);
	}
	
	public void  setDestination(String destcity)
	{
		waitForElement(desttext,20);
		typeText(desttext,destcity);
	}
	
	public void clickDepatureDate()
	{
		waitForElement(deparDate,20);
		clickElement(deparDate);
	}
	
	public void clickDate()
	{
		waitForElement(selectDate,20);
		clickElement(selectDate);
	}
	
	public void clickReturnDate()
	{
		waitForElement(returnDate,20);
		clickElement(returnDate);
	}
	
	public void clickReturnDateDetails()
	{
		waitForElement(date,20);
		clickElement(date);
	}
	
	public void selectPassenger()
	
	{
		waitForElement(passenger,20);
		clickElement(passenger);
	}
	
	public void addPassengerDetails()
	{
		waitForElement(addPassenger,20);
		clickElement(addPassenger);
	}
	public void clickCountry()
	{
		waitForElement(country,20);
		clickElement(country);
	}
	
	public void clickINR()
	{
		waitForElement(inr,20);
		clickElement(inr);
	}
	
	
	public void clickSearchFlight()
	{
		waitForElement(searchflight,20);
		clickElement(searchflight);
	}
	
	
	

}
