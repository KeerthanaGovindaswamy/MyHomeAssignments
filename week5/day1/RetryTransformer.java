package week5.day1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
//integrating the testcase with retryanalyzer using IAnnotation transformer interface
public class RetryTransformer implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation,Class testclass,Constructor testConstructor,Method testMethod) {
		annotation.setRetryAnalyzer(week5.day1.LearnRetryAnalayzer.class); //calling the class
		
	}

}
