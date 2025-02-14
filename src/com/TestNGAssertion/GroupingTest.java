package com.TestNGAssertion;

import org.testng.annotations.Test;

public class GroupingTest {
@Test(groups="sanity")
public void Test1()
{
	System.out.println("Sanity testing is successfull");
}
	@Test(groups="Regression")
	public void Test2()
	{
		System.out.println("Regression testing is successful");
	}
	@Test(groups="sanity,Regression")
	public void Test3()
	{
		System.out.println("Sanity and regression testing is successful");
	}
}
