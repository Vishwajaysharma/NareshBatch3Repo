package com.pack;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

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
	public static ExtentReports report;
	public static ExtentTest test;
	
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
		
		fis = new FileInputStream(projectPath+"/src/test/resource/log4jconfig.properties");
		PropertyConfigurator.configure(fis);
		
		report = ExtentManager.getInstance();
	}
	
	public static void launch(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(); 
		}else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url)
	{
		//driver.navigate().to(childprop.getProperty(url));
		driver.navigate().to(url);
	}
	
	public static void clickElement(String locatorkey) 
	{
		getLocatorType(locatorkey).click();
		//driver.findElement(By.xpath(locator)).click();
	}

	public static WebElement getLocatorType(String locatorkey) 
	{
		WebElement element = null;
		
		if(!isElementPresent(locatorkey))
			System.out.println("Element is not present : " + locatorkey);
		
		element = driver.findElement(locator(locatorkey));
		
		/*if(locatorkey.endsWith("_id")) {
			element = driver.findElement(By.id(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("_name")) {
			element = driver.findElement(By.name(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("_classname")) {
			element = driver.findElement(By.className(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("_css")) {
			element = driver.findElement(By.cssSelector(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("_linktext")) {
			element = driver.findElement(By.linkText(orprop.getProperty(locatorkey)));
		}else if (locatorkey.endsWith("_partiallinktext")) {
			element = driver.findElement(By.partialLinkText(orprop.getProperty(locatorkey)));
		}*/
		return element;
	}

	public static boolean isElementPresent(String locatorkey) 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator(locatorkey)));
			
			/*if(locatorkey.endsWith("_id")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orprop.getProperty(locatorkey))));
			}else if (locatorkey.endsWith("_name")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orprop.getProperty(locatorkey))));
			}else if (locatorkey.endsWith("_classname")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orprop.getProperty(locatorkey))));
			}else if (locatorkey.endsWith("_xpath")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orprop.getProperty(locatorkey))));
			}else if (locatorkey.endsWith("_css")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(orprop.getProperty(locatorkey))));
			}else if (locatorkey.endsWith("_linktext")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orprop.getProperty(locatorkey))));
			}else if (locatorkey.endsWith("_partiallinktext")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(orprop.getProperty(locatorkey))));
			}*/
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
	}
	
	
	public static By locator(String locatorkey)
	{
		By by = null;
		
		if(locatorkey.endsWith("_id")) {
			by = By.id(orprop.getProperty(locatorkey));
		}else if (locatorkey.endsWith("_name")) {
			by = By.name(orprop.getProperty(locatorkey));
		}else if (locatorkey.endsWith("_classname")) {
			by = By.className(orprop.getProperty(locatorkey));
		}else if (locatorkey.endsWith("_xpath")) {
			by = By.xpath(orprop.getProperty(locatorkey));
		}else if (locatorkey.endsWith("_css")) {
			by = By.cssSelector(orprop.getProperty(locatorkey));
		}else if (locatorkey.endsWith("_linktext")) {
			by = By.linkText(orprop.getProperty(locatorkey));
		}else if (locatorkey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(orprop.getProperty(locatorkey));
		}
		
		return by;
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
	
	public static void reportFailure(String FailureMessage,WebElement element ) throws Exception 
	{
		test.log(Status.FAIL, FailureMessage);
		takesScreenshot(element);
	}

	public static void reportSucess(String PassMessage) 
	{
		test.log(Status.PASS, PassMessage);
	}
	
	public static void takesScreenshot(WebElement element) throws Exception
	{
		Date dt=new Date();
		System.out.println(dt);
		String dateFormat=dt.toString().replace(":", "_").replace(" ", "_")+".png";		
		
		drawBorder(driver, element);
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"//failurescreenshots//"+dateFormat));
		
		test.log(Status.INFO,"Screenshot --->" +test.addScreenCaptureFromPath(System.getProperty("user.dir")+"//failurescreenshots//"+dateFormat));
	}
	
	public static void drawBorder(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='5px solid yellow'",element);
	}

}
