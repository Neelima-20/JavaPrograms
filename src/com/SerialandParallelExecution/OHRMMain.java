package com.SerialandParallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OHRMMain extends OHRMBaseTest {

	@Test
	public void LoginTest() throws InterruptedException 
	{
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("Neelim@20");
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		
	}
	
	@Test
	public void LOGOUT() throws InterruptedException
	{
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("Neelim@20");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(4000);

		
		
		//driver.findElement(By.linkText("Logout")).click();
		
		
		//Explicit property
		
		By logOutproperty=By.linkText("Logout");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(logOutproperty));
		WebElement logout=driver.findElement(logOutproperty);
		logout.click();
		
		//Explicit property
//		FluentWait<WebDriver>wait1=new FluentWait<WebDriver>(driver);
//		wait1.withTimeout(Duration.ofSeconds(30));
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(logOutproperty));
//		WebElement logOut=driver.findElement(logOutproperty);
//		logOut.click();
		
		
	}
}
