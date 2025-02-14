package com.WorkingwithDropdown;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		WebElement caffein=driver.findElementByName("coffee");
		Select coffee=new Select(caffein);
		List<WebElement>selectcoffee=coffee.getOptions();
		int selectcoffeesize=selectcoffee.size();
		System.out.println(selectcoffeesize);
		for(int menu=0;menu<selectcoffee.size();menu++)
		{
			System.out.println(selectcoffee.get(menu).getText());
		}
//		for(WebElement option:selectcoffee)
//		{
//			System.out.println("The menu of coffees is:"+option.getText());
//		}
		coffee.selectByIndex(0);
		coffee.selectByValue("cream");
		coffee.selectByVisibleText("With cream & sugar");
		WebElement firstcoffee=coffee.getFirstSelectedOption();
		System.out.println(firstcoffee.getText());
		List<WebElement> allselectedcoffee =coffee.getAllSelectedOptions();
		for(WebElement index:allselectedcoffee)
		{
			System.out.println("The all selected coffee options is:"+index.getText());
		}
		
	}

}
