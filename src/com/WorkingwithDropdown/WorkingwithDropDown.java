package com.WorkingwithDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement newsletters=driver.findElement(By.id("drop1"));
		Select oldnews=new Select(newsletters);
		List<WebElement>oldnewsletters=oldnews.getOptions();
//		int oldnewsletterscount=oldnewsletters.size();
//		System.out.println(oldnewsletterscount);
		//or
		System.out.println(oldnewsletters.size());
		for(int doc=0;doc<oldnewsletters.size();doc++)
		{
			System.out.println(oldnewsletters.get(doc).getText());
		}
		for(WebElement option:oldnewsletters)
		{
			System.out.println("The single selection dropdown selected text is:"+option.getText());
		}
		oldnews.selectByIndex(0);
		Thread.sleep(1000);
		oldnews.selectByValue("def");
		Thread.sleep(1000);
		oldnews.selectByVisibleText("doc 2");
		Thread.sleep(1000);
		//oldnews.deselectAll();
		WebElement doccount=oldnews.getFirstSelectedOption();
		System.out.println(doccount.getText());
		List<WebElement>alldocs=oldnews.getAllSelectedOptions();
		for(WebElement index:alldocs)
		{
			System.out.println("All selected options is:"+index.getText());
		}
		
	}

}
