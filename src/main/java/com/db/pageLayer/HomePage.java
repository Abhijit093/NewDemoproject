package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase
{
 
	
    public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
    
    //object Repository
	@FindBy(xpath="//a[@id='login2']")
	private WebElement login_link;
	
	
	@FindBy(xpath="//a[@id='nameofuser']")
	WebElement status_msg;
	
	
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	WebElement Phone_link;
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	WebElement Product1_samsungS6_link;
	
	@FindBy(xpath="//a[@id='cartur']")
	WebElement Cart_link;
	
	
	
	
	
	//Action Method
	public void clickOnLoginLink()
	{
		login_link.click();
	}
	
	
	public String getStatus()
	{
		String status = status_msg.getText();
		return status;
	}
	
	
	public void clickOnPhones()
	{
		Phone_link.click();
	}
	public void clickOnproduct()
	{
		Product1_samsungS6_link.click();
	}
	
	public void clickOnCartLink()
	{
		Cart_link.click();
	}
	
	
	
	
	
	
}
