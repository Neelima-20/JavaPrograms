package com.TestNGAssertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparameter {
@Test
@Parameters({"username","password"})
public void LoginTest(String user,String pass)
{
	System.out.println("username:"+user);
	System.out.println("password:"+pass);
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().window().maximize();
	
	WebElement usern=driver.findElement(By.id("username"));
	usern.sendKeys(user);
	WebElement passw=driver.findElement(By.id("password"));
	passw.sendKeys(pass);
	WebElement subm=driver.findElement(By.id("submit"));
	subm.click();
}
}
