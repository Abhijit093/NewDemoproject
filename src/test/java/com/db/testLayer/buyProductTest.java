package com.db.testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.db.pageLayer.CartPage;
import com.db.pageLayer.HomePage;
import com.db.pageLayer.LoginPage;
import com.db.utilities.UtilClass;

import testBase.TestBase;


//@Listeners(com.db.utilities.ListenerSetup.class)
public class buyProductTest extends TestBase
{
  @Test
  public void Verify_BuyProduct_withLogin() throws InterruptedException
  {
	 
	 HomePage home = new HomePage();
	 LoginPage login = new LoginPage();
	 CartPage Cart = new CartPage();
	 UtilClass util = new UtilClass();
	  
	 home.clickOnLoginLink();
	 
	 login.enterUsername("testacc5");
	 login.enterPassword("test");
	 login.clickOnLoginButton();
	 
	 
	 
	 Thread.sleep(5000);
	 home.clickOnPhones();
	  home.clickOnproduct();
	 Thread.sleep(5000);
	 
	 
	 Cart.clickOnAddcartButton();
	 
	
	 
	 Thread.sleep(5000);
	 util.acceptAlertPromt();
	 Thread.sleep(3000);
	 
	 home.clickOnCartLink();
	 
	 Thread.sleep(3000);
	 
	 Cart.clickOnPlaceOrderButton();
	 
	 Thread.sleep(3000);
	 
	 Cart.enterUserDetail();
	 Cart.clickOnPurchaseButton();
	 Thread.sleep(5000);
	 
	 
	 
	String Actual_output="Thank you for your purchas";
	 
	//WebElement Actual_output =  driver.findElement(By.xpath("//div[@class='sa-placeholder']"));
	 
	 Assert.assertEquals(Cart.getStatus(), Actual_output);
	
	  
	
	  System.out.println(Cart.getStatus());
	  
 }
  
  /*@Test
  public void Nokia()
  {
	  home.clickOnLoginLink();
		 
		 login.enterUsername("testacc5");
		 login.enterPassword("test");
		 login.clickOnLoginButton();
		 
		 
		 
		 Thread.sleep(5000);
		 home.clickOnPhones();
		  home.clickOnproduct();
		 Thread.sleep(5000);
		 
		 
		 Cart.clickOnAddcartButton();
		 
		
		 
		 Thread.sleep(5000);
		 util.acceptAlertPromt();
		 Thread.sleep(3000);
		 
		 home.clickOnCartLink();
		 
		 Thread.sleep(3000);
		 
		 Cart.clickOnPlaceOrderButton();
		 
		 Thread.sleep(3000);
		 
		 Cart.enterUserDetail();
		 Cart.clickOnPurchaseButton();
		 Thread.sleep(5000);
		 
		 
		 
		String Actual_output="Thank you for your purchas";
		 
		//WebElement Actual_output =  driver.findElement(By.xpath("//div[@class='sa-placeholder']"));
		 
		 Assert.assertEquals(Cart.getStatus(), Actual_output);
		
		  
		
		  System.out.println(Cart.getStatus());
  }*/
  
}
