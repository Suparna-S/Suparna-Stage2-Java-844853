package com.demo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ParameterizedTest1 {
	int expected;
	int actualinput;

	public ParameterizedTest1(int expected,int actualinput){
		super();
		this.expected=expected;
		this.actualinput=actualinput;
		System.out.println("Const: "+expected+" "+actualinput);
	}
	@Parameters
	public static Collection<Object[]>add12(){
		return Arrays.asList(new Object[][]{
			{4,2},{9,3},{16,4}
		});
		
	}
	@Test
	public void test() {
		Calc g=new Calc();
		assertEquals(expected,g.taxcal(actualinput));
		}

}
