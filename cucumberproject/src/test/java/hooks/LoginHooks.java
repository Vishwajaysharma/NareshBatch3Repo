package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import browserfactory.DriverFactory;
import io.cucumber.java.*;
import utils.ConfigReader;

public class LoginHooks 
{
	private ConfigReader configReader;
	private Properties prop;
	private DriverFactory driverFactory;
	
	@Before(order = 1)
	public void getProperty()
	{
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}
	
	@Before(order = 2)
	public void launchBrowser()
	{
		String browser = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driverFactory.init_driver(browser);
	}
	
	
	@After(order=1)
	public void quitBrowser()
	{
		DriverFactory.getDriver().quit();
	}
	
	@After(order=2)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			//take the screenshot
			String screenshotName = scenario.getName().replace(" ", "_");
			byte[] sourcePath = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}

}
