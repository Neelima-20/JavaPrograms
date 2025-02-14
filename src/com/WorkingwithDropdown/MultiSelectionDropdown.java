package com.WorkingwithDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement multiselect=driver.findElement(By.id("multiselect1"));
		Select options=new Select(multiselect);
		List<WebElement> languages=options.getOptions();
		int languagessize=languages.size();
		System.out.println(languagessize);
		for(int lan=0;lan<languages.size();lan++)
		{
			System.out.println(languages.get(lan).getText());
		}
//		for(WebElement option:languages)
//		{
//			System.out.println("The Multiselection dropdown selected text is"+option.getText());
//		}
		options.selectByIndex(0);
		Thread.sleep(2000);
		options.selectByValue("swiftx");
		Thread.sleep(2000);
		options.selectByVisibleText("Hyundai");
		Thread.sleep(2000);
		WebElement firstopt=options.getFirstSelectedOption();
		System.out.println(firstopt.getText());
		Thread.sleep(2000);
		List<WebElement> allopt=options.getAllSelectedOptions();
		for(WebElement index:allopt)
		{
			System.out.println("All selected options is"+index.getText());
		}
		Thread.sleep(5000);
		options.deselectAll();
	}

}
