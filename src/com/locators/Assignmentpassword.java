package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
 //<div class="_6luy _55r1 _1kbt _9nyh" id="passContainer"><input type="password" 
 //class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal-pass" 
 //placeholder="Password" aria-label="Password"><div class="_9ls7 hidden_elem" id="u_0_3_Ip"><a href="#" 
 //role="button"><div class="_9lsa"><div class="_9lsb" id="u_0_4_7m"></div></div></a></div></div>
 
 //Id
 //driver.findElement(By.id("pass")).sendKeys("Live Tech");
 
 //or
//WebElement gg =driver.findElement(By.id("pass"));
//gg.sendKeys("allmails");
 
 //Name
 //driver.findElement(By.name("pass")).sendKeys("gmail");

 //or
 //WebElement rr=driver.findElement(By.name("pass"));
 //rr.sendKeys("password");
 
 //Classname33
 driver.findElement(By.className("inputtext")).sendKeys("input");
 
 //or
 //WebElement yy=driver.findElement(By.className("inputtext"));
 //yy.sendKeys("uou");
 
 //Link
 //driver.findElement(By.linkText("Create a Page")).click();
 //driver.findElement(By.partialLinkText("Create")).click();---it will showing creat account button
 //driver.findElement(By.partialLinkText("Page")).click();
 //driver.findElement(By.partialLinkText(" a ")).click();
 //driver.findElement(By.partialLinkText("Create a Page")).click();
 
 //Xpath
//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("abcd");
  
 //or
 //WebElement ii=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
 //ii.sendKeys("ABCD");
 
 //Relativepath
 //driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("hh");
 
 //or
 //WebElement nn=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
 //nn.sendKeys("HH");
 
 //Css selector
 //driver.findElement(By.cssSelector("#pass")).sendKeys("dd");
 
 //or
 //WebElement mm=driver.findElement(By.cssSelector("#pass"));
 //mm.sendKeys("DD");
 
 //Tagname
 List<WebElement>list=driver.findElements(By.tagName("a"));
 System.out.println(list.size());
 //or
 int links=list.size();
 System.out.println(links);
	}

}
