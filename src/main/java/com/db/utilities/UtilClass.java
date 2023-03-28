package com.db.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class UtilClass extends TestBase
{
 public UtilClass()
 {
	 PageFactory.initElements(driver, this);
 }
 
 
 public void acceptAlertPromt()
 {
	 driver.switchTo().alert().accept();
 }
 
 public static void getScreenShot(String Filename)
 {
	 String path="C:\\Users\\Administrator\\eclipse-workspace\\Framework_Project\\src\\main\\java\\com\\db\\utilities\\ScreenShot\\";
	 TakesScreenshot sc=(TakesScreenshot)driver;
     File src = sc.getScreenshotAs(OutputType.FILE);
     File des =new File(path+Filename+System.currentTimeMillis()+".png");
     
     try
     {
    	 FileHandler.copy(src, des);
     }
     
     catch(IOException e)
     {
    	 System.out.println("File NOt Found");
    	 e.printStackTrace();
     }
	 
 }
 
}
