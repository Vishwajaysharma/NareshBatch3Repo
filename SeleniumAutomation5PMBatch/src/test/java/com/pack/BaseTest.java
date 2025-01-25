package com.pack;

import java.io.File;
import java.io.FileInputStream;
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
	public static Properties mainprop;
	public static Properties childprop;
	
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
		driver.navigate().to(childprop.getProperty(url));
	}

}
