package com.validatinganapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatinganapplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
//<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" 
		//aria-describedby="error" style="display: block;">
//driver.findElement(By.id("username")).sendKeys("Pooja");
String Expected_Title="login | salesforce";
System.out.println(Expected_Title);
String Actual_Title=driver.getTitle();
System.out.println(Actual_Title);
if(Expected_Title.equals(Actual_Title))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
if(Expected_Title.equalsIgnoreCase(Actual_Title))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}

//if(Actual_Title.contains(Expected_Title))
//{
//	System.out.println("true");
//}
//else
//{
//	System.out.println("false");
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
//}

if(Expected_Title.contains(Actual_Title))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
	}

}
