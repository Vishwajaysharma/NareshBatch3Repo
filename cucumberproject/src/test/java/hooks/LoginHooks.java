package hooks;

import java.util.Properties;

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
	
	
	@After
	public void quitBrowser()
	{
		
	}
	
	@After
	public void tearDown()
	{
		
	}

}
