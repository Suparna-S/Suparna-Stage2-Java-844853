package com.demo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestResult;
import junit.framework.TestSuite;

import org.junit.runner.JUnitCore;

public class TestSuite2 {

	public static void main(String[] args) {
		Result res=JUnitCore.runClasses(CalculateTest.class);
		for(Failure fa:res.getFailures()){
			System.out.println("Fail"+fa);
		}
System.out.println("Success??:" +res.wasSuccessful());
TestSuite suite=new TestSuite(AssertTest.class, DivTest.class);
TestResult result11=new TestResult();
suite.run(result11);
System.out.println("Number of testcases=" +result11.runCount());

	}

}
