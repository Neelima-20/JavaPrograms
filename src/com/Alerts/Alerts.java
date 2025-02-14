package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement alerts=driver.findElement(By.id("alert1"));
		alerts.click();
		Alert alerttext=driver.switchTo().alert();
		String alertbox=alerttext.getText();
		System.out.println(alertbox);
		Thread.sleep(2000);
		//alerttext.accept();
		driver.switchTo().alert().accept();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().sendKeys("LiveTech");
	}
	

}
