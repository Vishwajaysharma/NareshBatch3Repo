package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.pack.BaseTest;

public class Verification1 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Verification1");
		test.log(Status.INFO, "Init the properties files...");
		
		launch("chromebrowser");
		test.log(Status.INFO, "Launched the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigated to url : " + childprop.getProperty("amazonurl"));
		
		Thread.sleep(10000);
		
		WebElement ele = driver.findElement(By.linkText("Best Sellers"));
		String actuallink = ele.getText();
		String expectedllink = "Best Seller";
		
		if(actuallink.equals(expectedllink))
			reportSucess("Both links are equal...");
		else
			reportFailure("Both links are not equal...",ele);	
		
		report.flush();
	}
}
