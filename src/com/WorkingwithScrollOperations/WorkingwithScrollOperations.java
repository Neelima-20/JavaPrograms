package com.WorkingwithScrollOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithScrollOperations {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Scenario-1
        JavascriptExecutor js=(JavascriptExecutor)driver;
//        Thread.sleep(2000);
//	js.executeScript("window.scrollBy(0,200)", "");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-200)", "");
		
		//scenario-2
//WebElement exploreall=driver.findElement(By.linkText("Explore all"));
////exploreall.click();
//js.executeScript("arguments[0].scrollIntoView();", exploreall);
//Thread.sleep(200);
        WebElement bedsheets=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[2]/div[1]/div[1]/a/div[2]/span"));
        bedsheets.click();
        
     js.executeScript("arguments[0].scrollIntoView();", bedsheets);
//or
//WebElement seasonsale=driver.findElement(By.linkText("End of season sale"));
//js.executeScript("arguments[0].scrollIntoView();", seasonsale);

//or
//WebElement amazonlive=driver.findElement(By.linkText("See more from Amazon Live"));
//js.executeScript("arguments[0].scrollIntoView();", amazonlive);

//Scenario-3
//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
     driver.quit();
     

	}

}
