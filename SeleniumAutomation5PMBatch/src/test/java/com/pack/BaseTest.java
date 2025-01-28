package com.pack;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static String projectPath = System.getProperty("user.dir");
	public static WebDriver driver;
	public static File f;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainprop;
	public static Properties childprop;
	public static Properties orprop;
	
	public static void init() throws Exception
	{
		f = new File(projectPath+"/src/test/resource/data.properties");
		fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		//String value = p.getProperty("amazonurl");
		//System.out.println(value);
		
		fis = new FileInputStream(projectPath+"/src/test/resource/environment.properties");
		mainprop = new Properties();
		mainprop.load(fis);
		String e = mainprop.getProperty("env");
		System.out.println(e);
		
		
		
		fis = new FileInputStream(projectPath+"/src/test/resource/"+e+".properties");
		childprop = new Properties();
		childprop.load(fis);
		String url = childprop.getProperty("amazonurl");
		System.out.println(url);
		
		fis = new FileInputStream(projectPath+"/src/test/resource/or.properties");
		orprop = new Properties();
		orprop.load(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(); 
		}else if (p.getProperty(browser).equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url)
	{
		driver.navigate().to(childprop.getProperty(url));
	}
	
	public static void clickElement(String locatorkey) 
	{
		getLocatorType(locatorkey).click();
		//driver.findElement(By.xpath(locator)).click();
	}

	public static WebElement getLocatorType(String locatorkey) 
	{
		WebElement element = null;
		
		if(locatorkey.endsWith("_id")) {
			element = driver.findElement(By.id(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("name")) {
			element = driver.findElement(By.name(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("classname")) {
			element = driver.findElement(By.className(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("xpath")) {
			element = driver.findElement(By.xpath(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("css")) {
			element = driver.findElement(By.cssSelector(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("linktext")) {
			element = driver.findElement(By.linkText(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("partiallinktext")) {
			element = driver.findElement(By.partialLinkText(orprop.getProperty(locatorkey)));
		}
		return element;
	}

	public static void typeText(String locatorkey, String text) 
	{
		getLocatorType(locatorkey).sendKeys(text);
		//driver.findElement(By.name(locator)).sendKeys(text);
	}

	public static void selectOption(String locatorkey, String option) 
	{
		getLocatorType(locatorkey).sendKeys(option);
		//driver.findElement(By.id(locator)).sendKeys(option);
	}

}
