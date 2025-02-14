package com.workingwithmouseoveractions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwithmouseoveractions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://greenstechnologys.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
  driver.findElement(By.linkText("For Franchise Opportunities At Banglore")).click();
	
	  WebElement Courses=driver.findElement(By.xpath("/html/body/div[3]/div[2]/ul/li[3]/a"));
	  Actions action=new Actions(driver);
	  	action.moveToElement(Courses).build().perform();
	  	//driver.findElement(By.linkText("CONTACT US")).click();
  driver.findElement(By.xpath("/html/body/div[3]/div[2]/ul/li[6]/a")).click();
	}

}
