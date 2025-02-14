package com.workingwithmouseoveractions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithradiobuttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\javascripts2\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
driver.get("https://echoecho.com/htmlforms10.htm");
driver.manage().window().maximize();

WebElement tableproperty=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));

List<WebElement> grp1elements=tableproperty.findElements(By.name("group1"));
int grp1elementssize=grp1elements.size();
System.out.println(grp1elementssize);


//or
//System.out.println(grp1elements.size());
List<WebElement> grp2elements=tableproperty.findElements(By.name("group2"));
int grp2elementssize=grp2elements.size();
System.out.println(grp2elementssize);

for(int i=0;i<3;i++)
{
	grp1elements.get(i).click();
	for(int j=0;j<3;j++)
	{
		String index =grp1elements.get(j).getAttribute("value")+" "+grp1elements.get(j).getAttribute("checked");
		System.out.println(index);
	}
}
for(int i=0;i<3;i++)
{
	grp2elements.get(i).click();
	for(int j=0;j<3;j++)
	{
		String index=grp2elements.get(j).getAttribute("value")+" "+grp2elements.get(j).getAttribute("checked");
	System.out.println(index);
	}
}

	}

}
