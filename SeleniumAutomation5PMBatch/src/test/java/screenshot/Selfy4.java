package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy4 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> linknames = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int i=0;i<linknames.size();i++)
		{
			Date d = new Date();
			String dt = d.toString().replace(':', '_').replace(' ', '_');
			String lname = linknames.get(i).getText();
			linknames.get(i).click();
			
			File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcfile, new File("C:\\Users\\DELL\\Desktop\\screenshots\\"+lname+"_"+dt+".jpeg"));
			linknames = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}
	}

}
