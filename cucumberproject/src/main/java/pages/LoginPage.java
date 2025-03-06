package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	private WebDriver driver;
	
	private By usernameField = By.id("username");
	private By passwordField = By.id("password");
	private By submitButtonField = By.id("submit");
	private By loginsuccessField = By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged i')]");
	private By logoutButtonField = By.xpath("//a[normalize-space()='Log out']");
	private By loginErrorField = By.cssSelector("#error");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String userName)
	{
		driver.findElement(usernameField).sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clicksubmit()
	{
		driver.findElement(submitButtonField).click();
	}
	
	public String loginsuccess()
	{
		return driver.findElement(loginsuccessField).getText();
	}
	
	public String getCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean logOutButton()
	{
		return driver.findElement(logoutButtonField).isDisplayed();
	}

	public boolean loginErrorDisplayed()
	{
		return driver.findElement(loginErrorField).isDisplayed();
		
	}
	
	public String loginErrorText()
	{
		return driver.findElement(loginErrorField).getText();
		
	}
}
