package assertionpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertionTest 
{
	
  @Test
  public void f() 
  {
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		SoftAssert obj = new SoftAssert();
		
		
		System.out.println("step1");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in123";
		obj.assertTrue(actualTitle.contains(expectedTitle), "Both titles are not equal...");	
		
		
		System.out.println("step2");
		
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/abc";
		obj.assertTrue(actualurl.contains(expectedurl), "Both url are not equal");
		
		
		obj.assertAll();
  }
  
}
