package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "chrome exe file path");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//System.setProperty("webdriver.gecko.driver", "firefox exe file path");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		//System.setProperty("webdriver.edge.driver", "edge exe file path");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.redbus.in/");
	}

}
