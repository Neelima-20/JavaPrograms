package com.AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Neelim@20");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Neelima");
		driver.findElement(By.id("lastName")).sendKeys("Vanacharla");
		WebElement photo=driver.findElement(By.id("photofile"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", photo);
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//OHRMATestResultLogFiles//Passport.exe");
		driver.findElement(By.id("btnSave")).click();
	}
}
