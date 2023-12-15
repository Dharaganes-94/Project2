package com.spicejet.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.spicejet.utils.Sewrappers;

public class SignupPage extends Sewrappers{
	
	@FindBy(xpath="//div[text()='Signup']")
	public WebElement signup;
	
	@FindBy(xpath="//select[@class='form-control form-select ']") WebElement selectValue;
	
	@FindBy(xpath="//input[@id='first_name']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	public WebElement lastName;
	
	@FindBy(xpath="//select[@class='form-control form-select']") 
	
	public WebElement selectcountry;
	
	@FindBy(xpath="//input[@id='dobDate']")
	public WebElement dobdate;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']") WebElement selectMonth;
		
	@FindBy(xpath="//div[text()='2']")
	public WebElement selectdate;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']") WebElement selectDatepickeryear;
	
	@FindBy(xpath="//input[@class=' form-control']")
	public WebElement mobnumber;
	
	@FindBy(id="email_id")
	public WebElement emailId;
	
	@FindBy(id="new-password")
	public WebElement newPassword;
	
	@FindBy(id="c-password")
	public WebElement confirmPassword;
	
	@FindBy(id="defaultCheck1")
	public WebElement checkButton;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submitButton;
	
	public void clickSignup()
	{
		waitForElement(signup,20);
		clickElement(signup);
	}
	

	
	public void selectByValue(String value )
	{
		waitForElement(selectValue,20);
		Select sel = new Select(selectValue);
		sel.selectByValue(value);
		
	}
	
	public void setFirstName(String name)
	{
		waitForElement(firstName,20);
		typeText(firstName,name);
		
	}
	
	public void setLastName(String lastname)
	{
		waitForElement(lastName,20);
		typeText(lastName,lastname);
		
	}
	
	
	public void SelectByVisibleValue(String countryname)
	{
	
		waitForElement(selectcountry,20);
		Select sel = new Select(selectcountry);
		sel.selectByValue(countryname);

	}
	
	public void clickDobDate()
	{
		waitForElement(dobdate,20);
		clickElement(dobdate);
	}
		
	
	public void selectDatepickerMonth(String month)
	{
		Select select = new Select(selectMonth);
		select.selectByVisibleText(month);
	}
		
	
	public void clickDatePickerDate()
	{
		waitForElement(selectdate,20);
		clickElement(selectdate);
		
	}
	
	public void selectVisibleDateYear(String year)
	{
		waitForElement(selectDatepickeryear,20);
		Select select = new Select(selectDatepickeryear);
		select.selectByVisibleText(year);
	}
	
	
	public void mobNumber(String mob)
	{
		waitForElement(mobnumber,20);
		typeText(mobnumber,mob);
		
	}
	
	public void setEmailId(String email)
	{
		waitForElement(emailId,20);
		typeText(emailId,email);
		
	}
	
	public void setPassword(String pwd)
	{
		waitForElement(newPassword,20);
		typeText(newPassword,pwd);
			
	}
	
	public void setConfirmPassword(String cpwd)
	{
		waitForElement(confirmPassword,20);
		typeText(confirmPassword,cpwd);
		
	}
	
	public void clickDefaultCheck()
	{
		waitForElement(checkButton,20);
		clickElement(checkButton);
		
	}
	
	public void clcikSubmitSignup()
	{
		waitForElement(submitButton,20);
		clickElement(submitButton);
	}
	
	
	

}
