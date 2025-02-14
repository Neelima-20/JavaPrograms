package com.TestNGDataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataprovider {
	@DataProvider(name="loginData")
	public Object[][]getdata(){
		return new Object[][] {
			{"student","Livetech"},
			{"Livetech","Password123"},
			{"Livetech","Testing"},
			{"student","Password123"}
		};
	}
	@Test(dataProvider="loginData")
	public void LoginTest(String Username,String Password)
	{
		System.out.println("UserName:"+Username+","+"PassWord:"+Password);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement User=driver.findElement(By.id("username"));
		User.sendKeys(Username);
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(Password);
		driver.findElement(By.id("submit")).click();
	}
	

}
