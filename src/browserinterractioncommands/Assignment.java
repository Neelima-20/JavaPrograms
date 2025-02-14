package browserinterractioncommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.myntra.com/");
driver.manage().window().maximize();
driver.navigate().refresh();
String gg=driver.getPageSource();
System.out.println(gg);
String s=driver.getTitle();
System.out.println(s);
String f=driver.getCurrentUrl();
System.out.println(f);
driver.navigate().to("https://www.ajio.com/?srsltid=AfmBOorUSkepe9IehOuKO2DQXfDwgRD3TXJz1QFHVUTaTdBt5IWh3kSF");
driver.navigate().to("https://www.zeptonow.com/?srsltid=AfmBOoqfIKKChxpw8o5LmucRXE8puPVZ5dem50DPzmbpYbTVnq5nag-h");
driver.navigate().back();
driver.navigate().forward();
driver.close();
driver.quit();
	}

}
