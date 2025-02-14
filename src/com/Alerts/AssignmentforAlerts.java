package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentforAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
//		WebElement alertwithok =driver.findElement(By.linkText("Alert with OK"));
//		alertwithok.click();
//		WebElement buttons=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button"));
//		buttons.click();
//		Alert alerttext=driver.switchTo().alert();
//		String Alerttext=alerttext.getText();
//		System.out.println(Alerttext);
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		driver.switchTo().defaultContent();
		
		WebElement okandcancel=driver.findElement(By.linkText("Alert with OK & Cancel"));
		okandcancel.click();
		WebElement clickandcancel=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));
		clickandcancel.click();
		Alert alerttext1=driver.switchTo().alert();
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
	    driver.switchTo().defaultContent();
	    
		WebElement text=driver.findElement(By.linkText("Alert with Textbox "));
		text.click();
		WebElement entertext=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button"));
		entertext.click();
		Alert alerttext3=driver.switchTo().alert();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("LiveTech");
	}

}

