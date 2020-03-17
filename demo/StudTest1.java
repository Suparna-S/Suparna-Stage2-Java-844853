package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudTest1 
{
	Student s1=new Student();
	@Test
	public void test() 
	{
		s1.setS_ID(202);
		s1.setS_Name("BangtanSonyeondan");
		//expectedresult, actualresult
		assertEquals(202,s1.getS_ID());
		assertEquals("BangtanSonyeondan",s1.getS_Name());
	}

}
