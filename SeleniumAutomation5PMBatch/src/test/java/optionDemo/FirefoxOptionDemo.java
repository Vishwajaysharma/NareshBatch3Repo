package optionDemo;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxOptionDemo 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver;
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile pf = p.getProfile("firefoxprofile123");
		
		pf.setPreference("dom.webnotifications.enabled", false);
		
		pf.setAcceptUntrustedCertificates(true);
		pf.setAssumeUntrustedCertificateIssuer(false);
		
		//about:config
		//pf.setPreference("network.proxy.type", 1);
		//pf.setPreference("network.proxy.scoks", "192.168.10.1");
		//pf.setPreference("network.proxy.scoks_port", 1744);
		
		FirefoxOptions option = new FirefoxOptions();
		
		//option.addArguments("--headless");
		
		option.setProfile(pf);
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		option.addArguments("--private");
		
		driver = new FirefoxDriver(option);
		//driver.get("https://www.moneycontrol.com/promo/mc_interstitial_dfp.php?size=1280x540");
		//driver.get("https://expired.badssl.com/");
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}

}
