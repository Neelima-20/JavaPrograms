package com.workingoneditbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingoneditbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		//username
//<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" 
		//id="username" aria-describedby="error" style="display: block;">
WebElement UserName=driver.findElement(By.id("username"));
UserName.sendKeys("Pooja");

//password
//<input class="input r4 wide mb16 mt8 password" type="password" id="password" 
//name="pw" aria-describedby="error" aria-required="true" onkeypress="checkCaps(event)" autocomplete="off">
WebElement Password=driver.findElement(By.id("password"));
Password.sendKeys("neelu123");
String UserId=UserName.getAttribute("value");
System.out.println(UserId);

String pwd=Password.getAttribute("value");
System.out.println(pwd);

if(UserId.equals(pwd))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
driver.findElement(By.id("Login")).click();
	}

}
