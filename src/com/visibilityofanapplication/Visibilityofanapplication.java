package com.visibilityofanapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Visibilityofanapplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
		boolean displayed=username.isDisplayed();
		System.out.println(displayed);
		username.sendKeys("Neelima");
		
		WebElement password=driver.findElement(By.id("pass"));
		System.out.println(password);
		password.sendKeys("ss233");
		
		driver.findElement(By.id("u_0_0_Go")).click();
		//driver.findElement(By.linkText("Forgotten password?"));
		WebElement obj=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(obj).build().perform();
		
	}

}
