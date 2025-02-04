package com.pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example3 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("APjFqb")).sendKeys("hadoop");
		//Thread.sleep(3000);
		List<WebElement> listElements = driver.findElements(By.xpath("//div[@id='Alh6id']//ul/li//descendant::div[@class='wM6W7d']/span"));
		System.out.println("Elements size : " + listElements.size());
		
		/*for(WebElement element:listElements)
		{
			System.out.println(element.getText());
			if(element.getText().contains("hadoop tutorial"))
			{
				element.click();
				break;
			}
			listElements = driver.findElements(By.xpath("//div[@id='Alh6id']//ul/li//descendant::div[@class='wM6W7d']/span"));
		}*/
		
		for(int i=0;i<listElements.size();i++)
		{
			if(listElements.get(i).getText().contains("hadoop tutorial"))
			{
				listElements.get(i).click();
				break;
			}
		}
		
		
	}

}
