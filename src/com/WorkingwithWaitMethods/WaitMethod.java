package com.WorkingwithWaitMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		//implicit wait
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div/a/span"));
		login.click();
		WebElement seller=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/a/span"));
		seller.click();
		driver.navigate().back();
		WebElement flight=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/a[1]"));
		flight.click();

		
		
		//expliicit wait
        By Exploreproperty=By.xpath("/html/body/div/div/div[1]/div/div[2]/div[1]/div/a[2]");
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(Exploreproperty));
	    WebElement explore =driver.findElement(Exploreproperty);
		explore.click();
		
		//explicit wait another method for interview purpose
        FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(driver);
        wait1.withTimeout(Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(Exploreproperty));
		WebElement Explore=driver.findElement(Exploreproperty);
		Explore.click();
	}

}
