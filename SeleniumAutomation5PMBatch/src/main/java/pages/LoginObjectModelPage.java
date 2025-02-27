package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObjectModelPage 
{
	WebDriver driver;
	
	// UI Locators
	private By userNameFiled = By.id("email");
	private By passwordFiled = By.id("pass");
	private By loginButton = By.cssSelector("#u_0_5_WZ");
	
	
	public LoginObjectModelPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	//Action Methods
	public void enterUserName(String username)
	{
		driver.findElement(userNameFiled).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordFiled).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(loginButton).click();
	}

}
