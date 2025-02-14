package com.Windowsexampleparentandchild;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		driver.manage().window().maximize();
		WebElement helpProperty =driver.findElement(By.linkText("Help"));
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		helpProperty.click();
		Set<String> child =driver.getWindowHandles();
		System.out.println(child);
		if(parent.equals(child))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}

	}

}
