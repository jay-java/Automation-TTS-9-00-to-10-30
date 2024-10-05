package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class UserListener implements ITestListener {
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("test started");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("single test started");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test success");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test completed");
	}
}
