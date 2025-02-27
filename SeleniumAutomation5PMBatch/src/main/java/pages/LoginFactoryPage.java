package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFactoryPage 
{
	WebDriver driver;
	
	// UI Locators
	@FindBy(id="email") private WebElement userNameFiled;
	@FindBy(id="pass") private WebElement passwordFiled;
	@FindBy(css="#u_0_5_WZ") private WebElement loginButton;
		
	public LoginFactoryPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Action Methods
	public void enterUserName(String username)
	{
		userNameFiled.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordFiled.sendKeys(password);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}

}
