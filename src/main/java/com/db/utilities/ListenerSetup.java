package com.db.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
	  System.out.println("Test Case Excutation Started:" + result.getName());	
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Case Excutation Completed:" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Case Excutation Failed:" + result.getName());
		
		UtilClass.getScreenShot(result.getName());
		System.out.println("Take ScreenShot");
		
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Excuation Skiped:" + result.getName());
	}
 
	
	
	//------------**-----------------------------
	
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
 
}
