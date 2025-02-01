package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		String price1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[9]/td[4]")).getText();
		System.out.println(price1);
		
		String price2 = driver.findElement(By.xpath("//a[contains(text(),'Pulsar Internati')]/parent::td//following-sibling::td[3]")).getText();
		System.out.println(price2);
	}

}
