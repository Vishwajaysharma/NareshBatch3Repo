package testClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pack.BaseTest;

import pages.LoginFactoryPage;

public class LoginTest extends BaseTest
{
	
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String btype) throws Exception 
  {
	    init();
		test = report.createTest("LoginTest");
		test.log(Status.INFO, "Init the properties files...");
		
		launch(btype);
		test.log(Status.INFO, "Launched the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("facebookurl");
		test.log(Status.INFO, "Navigated to url : " + childprop.getProperty("facebookurl"));
  }
  
  
  @Test
  public void f() 
  {
	 // LoginObjectModelPage page = new LoginObjectModelPage(driver);
	  LoginFactoryPage page = new LoginFactoryPage(driver);
	  page.enterUserName("ravilella");
	  page.enterPassword("ravilella");
	  page.clickLogin();
	  //Assert.assertTrue(false, projectPath);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
