package com.spicejet.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class AddonsPage extends Sewrappers{
	
	@FindBy(xpath="(//div[text()='Add'])[3]")
	public WebElement addons;
	
	@FindBy(xpath="//div[text()='3B']")
	public WebElement addSeat1;
	
	@FindBy(xpath="//div[text()='4B']")
	public WebElement addSeat2;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	public WebElement clickDone;
	
	@FindBy(xpath="(//div[text()='Continue'])[3]")
	public WebElement clickContinue;
	
	@FindBy(xpath="//div[text()='UPI']")
	public WebElement clickupi;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-mcxt9x r-1xfd6ze r-d045u9 r-1loqt21 r-14g73ha r-1mi0q7o r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1b94p3d'])[2]")
	public WebElement selectupi;
	
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-poiln3']")
	public WebElement upiId;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[2]")
	public WebElement selectybl;
	
	@FindBy(xpath="//div[text()='@ybl']")
	public WebElement clickybl;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']")
	public WebElement clickterms;
	
   @FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5']")	
   public WebElement proceedtopay;
   
	public void clickAddButton()
	{
		waitForElement(addons,20);
		clickElement(addons);
	}
	
	public void clickAddSeat1()
	{
		waitForElement(addSeat1,20);
		clickElement(addSeat1);
	}
	
	public void clickAddSeat2()
	{
		waitForElement(addSeat2,20);
		clickElement(addSeat2);
	}
	
	public void clickDoneButton()
	{
		waitForElement(clickDone,20);
		clickElement(clickDone);
	}
	

	public void clickContinueButton()
	{

		waitForElement(clickContinue,20);
		clickElement(clickContinue);
	}
	
	public void clickUPIButton()
	{

		waitForElement(clickupi,20);
		clickElement(clickupi);
	}
	
	public void clickSelectUPI()
	{

		waitForElement(selectupi,20);
		clickElement(selectupi);
	}
	
	public void setUPIId(String upiid)
	{
		waitForElement(upiId,20);
		typeText(upiId,upiid);
	}
	
	public void clickSelectYBL()
	{

		waitForElement(selectybl,20);
		clickElement(selectybl);
	}
	
	public void clickYBL()
	{

		waitForElement(clickybl,20);
		clickElement(clickybl);
	}
	
	public void clickTermsAndCondition()
	{

		waitForElement(clickterms,20);
		clickElement(clickterms);
	}
	
	public void clickProccedToPayButton()
	{

		waitForElement(proceedtopay,20);
		clickElement(proceedtopay);
	}

}
