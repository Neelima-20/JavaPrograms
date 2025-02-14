package com.SerialandParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookBaseTest {

	WebDriver driver;
	String applicationURL="https://www.facebook.com/";
	
	@BeforeTest
	public void Applicationlaunch()
	{
		driver=new ChromeDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void Applicationclose()
	{
		driver.quit();
	}
}
