package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class LoginPage extends Sewrappers{
	
	@FindBy(xpath="//div[text()='Login']")
	public WebElement login;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[4]")
	public WebElement email;
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement emailText;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement loginpwd;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	public WebElement loginbutton;
	
	
	public void clickLoginButton()
	{
		waitForElement(login,30);
		clickElement(login);
		
	}
	
	public void clickEmailOption()
	{
		waitForElement(email,30);
		clickElement(email);
		
	}
	
	public void setEmailId(String emailid)
	{
		waitForElement(emailText,30);
		typeText(emailText,emailid);
	}
	
	public void setLoginPassword(String pwd)
	{
		waitForElement(loginpwd,30);
		typeText(loginpwd,pwd);
	}
	public void clickLoginB()
	{
		waitForElement(loginbutton,20);
		clickElement(loginbutton);
		
	}

}
