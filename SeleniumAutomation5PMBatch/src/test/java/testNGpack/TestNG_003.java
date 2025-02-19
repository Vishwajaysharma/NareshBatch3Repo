package testNGpack;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pack.BaseTest;

public class TestNG_003 extends BaseTest
{
  @Parameters({"browser","url"})
  @BeforeMethod
  public void startup(String btype,@Optional("https://www.amazon.in/") String url) throws Exception 
  {
	  System.out.println("startup");
	  
	    init();
		test = report.createTest("TestNG_003");
		test.log(Status.INFO, "Init the properties files...");
		
		launch(btype);
		test.log(Status.INFO, "Launched the Browser : " + btype);
		
		navigateUrl(url);
		test.log(Status.INFO, "Navigated to url : " + url);
  }
  
  @Test
  public void amazon() throws InterruptedException
  {
	
  }
  
  

}
