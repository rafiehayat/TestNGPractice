package RetryLogicDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	
	int counterForRetryAttempts = 0;
	
	int setMaxLimitForRetry = 3;

	//Method To Retry Failed Test Cases
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess())
		{
			if(counterForRetryAttempts < setMaxLimitForRetry)
			{
				counterForRetryAttempts++;
				return true;
			}
		}
		return false;
	}
}
