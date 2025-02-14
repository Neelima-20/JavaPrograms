package browserinterractioncommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browserinteractionmethods {

	public static void main(String[] args) throws InterruptedException {
		
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://www.flipkart.com/");
  //Thread.sleep(5000);
  driver.manage().window().maximize();
  //driver.navigate().refresh();
  //String src= driver.getPageSource();
  //System.out.println(src);
  
//or
//System.out.println(driver.getPageSource());
  
  //String title=driver.getTitle();
  //System.out.println(title);
  String url=driver.getCurrentUrl();
   System.out.println(url);
   driver.navigate().to("https://www.meesho.com/?srsltid=AfmBOoqdf4fUYoA57mQdygW2fSNun5tstc71gGAWqPWbm61AYszd5wp8");
   //driver.navigate().back();
   //driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=6252830202008618159&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062127&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
   //driver.navigate().forward(); 
   //driver.close();
   //driver.quit();
  
	}

}