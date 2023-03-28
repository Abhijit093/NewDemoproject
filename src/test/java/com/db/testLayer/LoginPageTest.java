package com.db.testLayer;

import org.testng.Assert;


import org.testng.annotations.Test;

import com.db.pageLayer.HomePage;
import com.db.pageLayer.LoginPage;

import testBase.TestBase;

//@Listeners(com.db.utilities.ListenerSetup.class)

public class LoginPageTest extends TestBase
{
	
 	
 @Test
 public void verifyLogin() throws InterruptedException
 {
	 HomePage homepage = new HomePage();
	 LoginPage login = new LoginPage();
	 homepage.clickOnLoginLink();
	 
	 
	 
	 login.enterUsername("testacc5");
	 login.enterPassword("test");
	 login.clickOnLoginButton();
	 
	 
	 Thread.sleep(5000);
	 String Actual_op=homepage.getStatus();
	 String Expected_op="Welcome testacc4";
	 Assert.assertEquals(Actual_op, Expected_op);
	 System.out.println(Actual_op);
	 
	 homepage.clickOnPhones();
	 homepage.clickOnproduct();
	 
	 
	 Thread.sleep(5000);
	 
 }
}
