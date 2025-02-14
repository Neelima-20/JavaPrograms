package com.Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
//		int cookieSize=cookie.size();
//		System.out.println(cookieSize);
		
		if(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+" "cookie.getValue());
		}
		//System.out.println();
	}

}
