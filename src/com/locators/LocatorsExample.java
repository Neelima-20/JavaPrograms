package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal-email"
//placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">

//ID
//driver.findElement(By.id("email")).sendKeys("LiveTech");

//or//
//WebElement gg=driver.findElement(By.id("email"));
//gg.sendKeys("Live");

//or//
//String userN="Testing Tools";
//By user=By.id("email");
//WebElement UserNameProperty=driver.findElement(user);
//UserNameProperty.sendKeys(userN);

//Name
//driver.findElement(By.name("email")).sendKeys("Testing");

//or//
//WebElement userName=driver.findElement(By.name("email"));
//userName.sendKeys("Testing");

//Classname
//driver.findElement(By.className("inputtext")).sendKeys("test");

//or
//WebElement aa=driver.findElement(By.className("inputtext"));
//aa.sendKeys("mail");

//Link
//driver.findElement(By.linkText("Forgotten password?")).click();
//driver.findElement(By.partialLinkText("Forgotten")).click();
//driver.findElement(By.partialLinkText("?")).click();
//driver.findElement(By.partialLinkText("Forgotten password?")).click();

//Xpath-absolute
//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("retest");

//or//
//WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
//email.sendKeys("Automation");

//relative-xpath
//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("right");

//or
//WebElement emailID = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//emailID.sendKeys("Selenium");

//tagname
//List<WebElement>list=driver.findElements(By.tagName("a"));
//System.out.println(list.size());

//or
//int links=list.size();
//System.out.println(links);

//Css selector
//driver.findElement(By.cssSelector("#email")).sendKeys("java");

//or//
WebElement cat=driver.findElement(By.cssSelector("#email[id='email']"));
cat.sendKeys("gang");
	}

}
