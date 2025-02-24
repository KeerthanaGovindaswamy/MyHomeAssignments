package week5.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class LearnRetryAnalayzer implements IRetryAnalyzer {

	int count=0;
	public boolean retry(ITestResult result) {//this is the method from IRetryAnalyzer interface
		//true---->it will retry
		//false---->it will not retry
		
		
		
		if(count<2) {//0<2       1<2   2<2(goes out of loop)
			count++;//0--->1     1---->2
			return true;//1     2(it will retry two times)
		}
		return false;
	}

}
