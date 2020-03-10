package FailedTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

	
	
	int failedcount = 0;
	
	int limit = 4;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(failedcount<limit)
		{
			failedcount++;
			return true;
		}
		
		return false;
	}

}
