package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase
{

	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement username_textbox;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//div[@id='logInModal']/descendant::button[3]")
	private WebElement login_button;
	
	
	
	public void enterUsername(String username)
	{
		username_textbox.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		password_textbox.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		login_button.click();
	}
	

}
