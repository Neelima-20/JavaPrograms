package com.WorkingwithKeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement text=driver.findElement(By.name("text1"));

	text.sendKeys("Hi"
		+ "I am Neelima");
//	WebElement text2=driver.findElement(By.name("text2"));
//
//	text2.sendKeys("Hi "+"I am Pooja");
	
	//ctr+A
	Actions action=new Actions(driver);
	action.keyDown(Keys.CONTROL);
	action.sendKeys("a");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	//ctrl+C
	action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	
	WebElement text2=driver.findElement(By.id("inputText2"));
	
	//Tab
	action.sendKeys(Keys.TAB);
	action.perform();
	
	//ctr+v
	action.keyDown(Keys.CONTROL);
	action.sendKeys("v");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	
WebElement textbutton=driver.findElement(By.className("compareButtonText"));
textbutton.click();
WebElement sbutton=driver.findElement(By.id("switchButton"));
sbutton.click();
WebElement edittext=driver.findElement(By.xpath("/html/body/div[2]/form/div/table/tbody/tr/td[1]/button[1]"));
edittext.click();
//Thread.sleep(200);
WebElement clear=driver.findElement(By.xpath("/html/body/div[2]/form/div/table/tbody/tr/td[3]/button"));
clear.click();



	}

}
