package Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_listener implements ITestListener{
	@Override		
	public void onTestStart(ITestResult result) {
		
		System.out.println("Started the test Case - "+result.getName());
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Passed the Test Case - "+result.getName());
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		
		System.out.println("FAILED the Test Case - "+result.getName());
		
	
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("This Test case Skipped - "+result.getName());
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test Failed But Within Success Percentage - "+result.getName());
	
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("Test Failed With Timeout - "+result.getName());
		
	}

}
