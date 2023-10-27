package testNGMyPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class OhrmListenersClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult Result) {
	Reporter.log(Result.getName()+"This test Method Got start Excecuting");
	System.out.println(Result.getName()+"This test Method Got start Excecuting");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
	
	
	
	
	
	
	
}
