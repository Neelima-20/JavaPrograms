package com.SerialandParallelExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FacebookMain extends FacebookBaseTest{

	@Test
	public void Facebooklogintest()
	{
	driver.findElement(By.id("email")).sendKeys("neelimavanacharla@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("9573279864");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}
	
}
