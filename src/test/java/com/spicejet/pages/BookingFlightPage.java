package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class BookingFlightPage extends Sewrappers{
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
	public WebElement title;
	
	@FindBy(xpath="//div[text()='Mrs']")
	public WebElement titleMrs;
	
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy']")
	public WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	public WebElement conctactinfo;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	public WebElement mail;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	public WebElement country;
	
	@FindBy(xpath="//div[text()='India']")
	public WebElement selectIndia;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	public WebElement textCity;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[3]")
	public WebElement clickbutton;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[5]")
	public WebElement primarypassenger;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	public WebElement passengertitle;
	
	@FindBy(xpath="//div[text()='Mrs']")
	public WebElement mrsbutton;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	public WebElement passenFirstname;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	public WebElement passenLastname;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	public WebElement passenMobNo;
	
	@FindBy(xpath="//div[text()='Next']")
	public WebElement nextButton;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	public WebElement passenger2;
	
	@FindBy(xpath="//div[text()='Miss']")
	public WebElement missbutton;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[5]")
	public WebElement passen2FirstName;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	public WebElement passen2LastName;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	public WebElement passen2Mobno;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	public WebElement clickcontinue;
	
	public void clickTile()
	{
		waitForElement(title,10);
		clickElement(title);
	}
	
	public void clickTileasMrs()
	{
		waitForElement(titleMrs,10);
		clickElement(titleMrs);
	}
	
	public void setFirstName(String name)
	{
		waitForElement(firstname,20);
		typeText(firstname,name);

	}
	
	public void setLastName(String lstname)
	{
		waitForElement(lastname,20);
		typeText(lastname,lstname);

	}
	
	public void setContactInfo(String phn)
	{
		waitForElement(conctactinfo,20);
		typeText(conctactinfo,phn);

	}
	
	public void setEmailId(String mailId)
	{
		waitForElement(mail,20);
		typeText(mail,mailId);

	}
	
	public void clickCountry()
	{
		waitForElement(country,20);
		clickElement(country);
	}
	
	public void clickCountryName()
	{
		waitForElement(selectIndia,20);
		clickElement(selectIndia);
		
	}
	
	public void setCityName(String city)
	{
		waitForElement(textCity,20);
		typeText(textCity,city);

	}
	
	public void clickButton()
	{
		waitForElement(clickbutton,20);
		clickElement(clickbutton);
	}
	
	public void clickPrimaryPassenger()
	{
		waitForElement(primarypassenger,20);
		clickElement(primarypassenger);
	}
	
	public void clickPassenger1Title()
	{
		waitForElement(passengertitle,20);
		clickElement(passengertitle);
	}
	
	public void clickPassenger1Mrs()
	{
		waitForElement(mrsbutton,20);
		clickElement(mrsbutton);
	}
	
	public void setPassenger1FirstName(String FirstName)
	{
		waitForElement(passenFirstname,20);
		typeText(passenFirstname,FirstName);
	}
	
	public void setPassenger1LastName(String LastName)
	{
		waitForElement(passenLastname,20);
		typeText(passenLastname,LastName);
	}
	public void setPassenger1MobNo(String MobileNo)
	{
		waitForElement(passenMobNo,20);
		typeText(passenMobNo,MobileNo);
	}
	
	public void clickNextButton()
	{
		waitForElement(nextButton,20);
		clickElement(nextButton);
	}
	public void clickPassenger2Title()
	{
		waitForElement(passenger2,20);
		clickElement(passenger2);
	}

	public void clickPassengerMissButton()
	{
		waitForElement(missbutton,20);
		clickElement(missbutton);
	}
	
	public void setPassenger2FirstName(String name1)
	
	{
		waitForElement(passen2FirstName,20);
		typeText(passen2FirstName,name1);
	}
	
   public void setPassenger2LasttName(String name2)
	
	{
		waitForElement(passen2LastName,20);
		typeText(passen2LastName,name2);
	}
   
   public void setPassenger2MobNo(String PhoneNo)
   {
	   waitForElement(passen2Mobno,20);
	   typeText(passen2Mobno,PhoneNo);
   }
   
   public void clickContinueButton()
	{
		waitForElement(clickcontinue,20);
		clickElement(clickcontinue);
	}
	 
	
	

}
