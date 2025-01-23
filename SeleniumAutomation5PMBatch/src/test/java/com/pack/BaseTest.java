package com.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
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
	
	
	public static void init() throws Exception
	{
		f = new File(projectPath+"/src/test/resource/data.properties");
		fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		//String value = p.getProperty("amazonurl");
		//System.out.println(value);
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
	}
	
	public static void navigateUrl(String url)
	{
		driver.navigate().to(p.getProperty(url));
	}

}
