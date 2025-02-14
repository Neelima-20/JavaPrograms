package com.WorkingwithLog4j;

import org.apache.commons.logging.Log;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//System.out.println("Testing");
		Logs.info("testing");

	}

}
