package actionsAndJavascriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo 
{
	static WebDriver driver;
	static Actions a;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");	
		
		mouseOverElement("//span[text()='Sign In']");
	}

	public static void mouseOverElement(String locator)
	{
		a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(locator))).perform();
		driver.findElement(By.linkText("Your Account")).click();
	}
	
}
