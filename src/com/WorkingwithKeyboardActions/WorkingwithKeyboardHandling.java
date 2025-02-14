package com.WorkingwithKeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithKeyboardHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		WebElement name=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/input"));
		name.sendKeys("Neelima");
		//action.sendKeys(Keys.CLEAR).perform();
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("neelima@gmail.com");
		WebElement address=driver.findElement(By.id("currentAddress"));
		address.sendKeys("Durgam,Hyd");
		
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
		action.sendKeys(Keys.BACK_SPACE).perform();
		
		WebElement peraddress=driver.findElement(By.id("permanentAddress"));
		
		action.sendKeys(Keys.TAB);
		action.perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();
		Thread.sleep(200);
		
		
		action.sendKeys(Keys.SPACE).perform();
		
		
		WebElement button=driver.findElement(By.id("submit"));
		button.click();
		
		
	}

}
