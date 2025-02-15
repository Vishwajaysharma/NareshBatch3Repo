package testNGpack;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pack.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TestNG_002 extends BaseTest
{
	
  @BeforeMethod
  @Parameters("browser")
  public void startup(String btype) throws Exception 
  {
	  System.out.println("startup");
	  
	    init();
		test = report.createTest("TestNG_002");
		test.log(Status.INFO, "Init the properties files...");
		
		launch(btype);
		test.log(Status.INFO, "Launched the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigated to url : " + childprop.getProperty("amazonurl"));
  }
  
  @Test
  public void amazon() throws Exception 
  {
	  System.out.println("amazon");
	  
	    Thread.sleep(10000);
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.PASS, "selected the option from dropbox By using locator : " + orprop.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchbox_id","Harry Potter");
		test.log(Status.PASS, "Entered the text by using  locator : " + orprop.getProperty("amazonsearchbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.FAIL, "Clicked the Element by using locator : " +  orprop.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod
  public void windup() 
  {
	  System.out.println("windup");
	  
	  report.flush();
	  
	  driver.quit();
  }

}
