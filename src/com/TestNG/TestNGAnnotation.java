package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
@Test()
public void Testcase()
{
	System.out.println("This is my first test case");
}

@BeforeMethod()
public void beforemethod()
{
	System.out.println("This will execute before every method");
}
@AfterMethod()
public void aftermethod()
{
	System.out.println("This will execute after every method");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("This will execute before every class");
}
@AfterClass
public void afterclass()
{
	System.out.println("This will execute after every class");
}
@BeforeSuite
public void beforesuite()
{
	System.out.println("This will execute before every suite");
}
@AfterSuite()
public void aftersuite()
{
	System.out.println("This will execute after every suite");
}
@AfterTest()
public void aftertest()
{
	System.out.println("This will execute after every test");
}
	@BeforeTest()
	public void beforetest()
	{
		System.out.println("This will execute before every test");
	}
}

