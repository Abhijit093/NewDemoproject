package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class CartPage extends TestBase 
{
  
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	WebElement AddCart_button;
	
	@FindBy(xpath="//div[@id='videoModal']/following-sibling::div/descendant::button")
	WebElement PlaceOrder_Button;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement usrname_txtbox;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement Country_txtbox;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement City_txtbox;
	
	@FindBy(xpath="//input[@id='card']")
	WebElement Card_txtbox;
	
	@FindBy(xpath="//input[@id='month']")
	WebElement month_txtbox;
	
	@FindBy(xpath="//input[@id='year']")
	WebElement year_txtbox;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement Purchase_button;
	
	@FindBy(xpath="//h2[text()='Thank you for your purchase!']")
	WebElement status_msg;
	
	public void clickOnAddcartButton()
	{
		AddCart_button.click();
	}
	
	public void clickOnPlaceOrderButton()
	{
		PlaceOrder_Button.click();
	}
	
	public void enterUserDetail()
	{
		usrname_txtbox.sendKeys("Abhijit");
		Country_txtbox.sendKeys("India");
		City_txtbox.sendKeys("Pune");
		Card_txtbox.sendKeys("1562282");
		month_txtbox.sendKeys("12/12");
		year_txtbox.sendKeys("2023");
	
	}
	
	public void clickOnPurchaseButton()
	{
		Purchase_button.click();
	}
	
	
	public String getStatus()
	{
		return status_msg.getText();
	}
}
