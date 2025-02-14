package com.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotsexample {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		//fullscreenshot
//		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot, new File(".\\Screenshot\\Demoquapage.png"));
		
		//sectionscreenshot
//		WebElement details =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]"));
//		File screenshot=details.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot, new File(".\\Screenshot\\demoquadetails.png"));

		//particularlogoscreenshot
		
		WebElement logo=driver.findElement(By.xpath("/html/body/div[2]/header/a/img"));
		File screenshot=logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".\\Screenshot\\demoqualogo.png"));
		
	}

}
