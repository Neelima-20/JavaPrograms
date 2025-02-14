package com.SerialandParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OHRMBaseTest {
	WebDriver driver;
String ApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

@BeforeMethod
	public void Applicationlaunch()
	{
		driver=new ChromeDriver();
		driver.get(ApplicationURLAddress);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

@AfterMethod
	public void Applicationclose()
	{
		driver.quit();
	}
}
