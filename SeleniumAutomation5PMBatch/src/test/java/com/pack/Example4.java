package com.pack;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example4 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println("rows : " +  rows);
		ArrayList<Double> a = new ArrayList<Double>();
		
		for(int i=1;i<=rows;i++)
		{
			String loc = "//table[@class='dataTable']/tbody/tr["+i+"]/td[4]";
			String cPrice = driver.findElement(By.xpath(loc)).getText();
			//System.out.println("Current price  :" + cPrice);
			NumberFormat nf = NumberFormat.getInstance();
			Number n = nf.parse(cPrice);
			String price = n.toString();
			double dPrice = Double.parseDouble(price);
			//System.out.println("Double price  :" + dPrice);
			a.add(dPrice);
		}
		Collections.sort(a);
		System.out.println(a);
		System.out.println("Min Value : " +  a.get(0));
		System.out.println("Max value : " +  a.get(a.size()-1));
	}

}
