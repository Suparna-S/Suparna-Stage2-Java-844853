package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest 
{
	private int first;
	private int second;
	private int expected;
	Calculate cal;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("@Run Once Before Class-Program Started");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("@Run Once After Class-Program Terminated");
	}

	@Before
	public void setUp() throws Exception 
	{
		cal=new Calculate();
		expected=cal.sum(5,3);
		System.out.println("@Before-Expected: "+expected);
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("@After-End of test case");
	}

	@Test
	public void test() 
	{
		System.out.println("My first test case");
		Calculate add=new Calculate();
		first=15;
		second=3;
		assertEquals(expected, add.sum(first,second));
		System.out.println("Expected: "+expected);
	}
	@Test
	public void test1() 
	{
System.out.println("Second test case");
	}
}
