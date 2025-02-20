package assertionpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertionTest2 
{
	
  @Test
  public void f() 
  {
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		System.out.println("step1");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in123";
		Assert.assertTrue(actualTitle.contains(expectedTitle), "Both titles are not equal...");	
		
		
		System.out.println("step2");
		
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/";
		Assert.assertTrue(actualurl.contains(expectedurl), "Both url are not equal");
  }
}
