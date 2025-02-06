package screenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy3 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		
		
		String linkname = driver.findElement(By.linkText("Best Sellers")).getText();
		System.out.println(linkname);
		
		List<WebElement> linkname1 = driver.findElements(By.tagName("a"));
		for(int i=0;i<linkname1.size();i++)
		{
			String lname = linkname1.get(i).getText();
			System.out.println(lname);
		}
		
		
		List<WebElement> linkname2 = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		for(int j=0;j<linkname2.size();j++)
		{
			String lname1 = linkname2.get(j).getText();
			System.out.println(lname1);
		}
	}

}
