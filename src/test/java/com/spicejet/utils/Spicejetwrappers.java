package com.spicejet.utils;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.pages.BookingFlightPage;
import com.spicejet.pages.LoginPage;
import com.spicejet.pages.OnewayTripPage;
import com.spicejet.pages.PaymentInfoPage;
import com.spicejet.pages.AddonsPage;
import com.spicejet.pages.RoundTripPage;
import com.spicejet.pages.SelectFlightPage;
import com.spicejet.pages.SignupPage;

public class Spicejetwrappers extends Sewrappers{
	
	public void signupSpicejet( String value,String name,String lastname, String countryname,String month,String year, String mob,String email, String pwd,String cpwd) 
	{
        SignupPage signupPage =  PageFactory.initElements(driver, SignupPage.class)	;	
        
		signupPage.clickSignup();
		signupPage.windowHandlingParentWindow();
		signupPage.selectByValue(value);
		signupPage.setFirstName(name);
		signupPage.setLastName(lastname);
		signupPage.SelectByVisibleValue(countryname);
		signupPage.clickDobDate();
		signupPage.selectDatepickerMonth(month);
		signupPage.clickDatePickerDate();
		signupPage.selectVisibleDateYear(year);
		signupPage.mobNumber(mob);
		signupPage.setEmailId(email);
		signupPage.setPassword(pwd);
		signupPage.setConfirmPassword(cpwd);
		signupPage.clickDefaultCheck();
		signupPage.clcikSubmitSignup();
	}
	
	public void loginSpicejet(String emailid, String pwd)
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.clickLoginButton();
		loginPage.clickEmailOption();
		loginPage.setEmailId(emailid);
		loginPage.setLoginPassword(pwd);
		loginPage.clickLoginB();
	}
	
	public void oneWayTrip(String city, String destcity)
	{
		OnewayTripPage oneway = PageFactory.initElements(driver, OnewayTripPage.class);
		
		oneway.setOrigin(city);
		oneway.setDestination(destcity);
		oneway.clickDepatureDate();
		oneway.clickDate();
		oneway.clickPassenger();
		oneway.addPassengersNumber();
		oneway.clickCountry();
		oneway.clickINR();
		oneway.clickSearchFlight();
	
	}
	
	public void roundTrip(String city, String destcity)
	{
		RoundTripPage roundtrip = PageFactory.initElements(driver, RoundTripPage.class);
		
		roundtrip.clickRoundTrip();
		roundtrip.setOrigin(city);
		roundtrip.setDestination(destcity);
		roundtrip.clickDepatureDate();
		roundtrip.clickDate();
		roundtrip.clickReturnDate();
		roundtrip.clickReturnDateDetails();
		roundtrip.selectPassenger();
		roundtrip.addPassengerDetails();
		roundtrip.clickCountry();
		roundtrip.clickINR();
		roundtrip.clickSearchFlight();
	}
	
	public void selectFlight()
	
	{
		SelectFlightPage flightPage = PageFactory.initElements(driver, SelectFlightPage.class);
		
		flightPage.clickForDirectFlight();
		flightPage.clickContinueButton();
		
	}
	
	public void bookingForm(String name,String lstname,String phn,String mailId,String city,String FirstName,String LastName,String MobileNo,String name1,String name2,String PhoneNo)
	
	{
		BookingFlightPage bookForm = PageFactory.initElements(driver, BookingFlightPage.class);
		
		bookForm.clickTile();
		bookForm.clickTileasMrs();
		bookForm.setFirstName(name);
		bookForm.setLastName(lstname);
		bookForm.setContactInfo(phn);
		bookForm.setEmailId(mailId);
		bookForm.setCityName(city);
		bookForm.clickButton();
		bookForm.clickPrimaryPassenger();
		bookForm.clickPassenger1Title();
		bookForm.clickPassenger1Mrs();
		bookForm.setPassenger1FirstName(FirstName);
		bookForm.setPassenger1LastName(LastName);
		bookForm.setPassenger1MobNo(MobileNo);
		bookForm.clickNextButton();
		bookForm.clickPassenger2Title();
		bookForm.clickPassengerMissButton();
		bookForm.setPassenger2FirstName(name1);
		bookForm.setPassenger2LasttName(name2);
		bookForm.setPassenger2MobNo(PhoneNo);
		bookForm.clickContinueButton();
	}
	
	public void addonPage()
	{
		AddonsPage pay = PageFactory.initElements(driver, AddonsPage.class);
		
		pay.clickAddButton();
		pay.clickAddSeat1();
		pay.clickAddSeat2();
		pay.clickDoneButton();
		pay.clickContinueButton();
		
	}
	
	public void paymentInfo(String upiid)
	
	{
		PaymentInfoPage payment = PageFactory.initElements(driver, PaymentInfoPage.class);
		
		payment.clickUPIButton();
		payment.clickSelectUPI();
		payment.setUPIId(upiid);
		payment.clickSelectYBL();
		payment.clickYBL();
		payment.clickTermsAndCondition();
		payment.clickProccedToPayButton();
		
	}
	

}
