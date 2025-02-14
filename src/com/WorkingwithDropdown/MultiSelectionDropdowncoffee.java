package com.WorkingwithDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropdowncoffee {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		WebElement coffeetime=driver.findElement(By.name("coffee2"));
		Select Ctime=new Select(coffeetime);
		List<WebElement> Coffeetimemenu=Ctime.getOptions();
		int menusize=Coffeetimemenu.size();
		System.out.println(menusize);
		for(int m=0;m<Coffeetimemenu.size();m++)
		{
			System.out.println(Coffeetimemenu.get(m).getText());
		}
		for(WebElement option:Coffeetimemenu)
		{
			System.out.println("the coffeetimemenu is:"+option.getText());
		}
		Ctime.selectByIndex(1);
		Thread.sleep(2000);
		Ctime.selectByValue("cream");
		Thread.sleep(2000);
		Ctime.selectByVisibleText("Honey");
		Thread.sleep(2000);
		WebElement opt1=Ctime.getFirstSelectedOption();
		System.out.println(opt1.getText());
		Thread.sleep(2000);
		List<WebElement> allopts=Ctime.getAllSelectedOptions();
		for(WebElement index:allopts)
		{
			System.out.println("the all selected opts is:"+index.getText());
		}
		Thread.sleep(2000);
		Ctime.deselectAll();
	}

}
