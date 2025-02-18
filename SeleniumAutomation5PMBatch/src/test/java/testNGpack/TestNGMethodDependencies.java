package testNGpack;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGMethodDependencies 
{
	
  @Test(priority = 1)
  public void orange(Method method) 
  {
	  System.out.println(method.getName());
  }
  
  @Test(priority = 2,dependsOnMethods = {"orange"})
  public void white(Method method) 
  {
	  System.out.println(method.getName());
  }
  
  @Test(priority = 3,dependsOnMethods = {"white"})
  public void blue(Method method) 
  {
	  System.out.println(method.getName());
	  //Assert.fail(method.getName() + "  - is failed");
	  throw new SkipException(method.getName() + " - is skipped");
  }
  
  @Test(priority = 4,dependsOnMethods = {"blue"})
  public void green(Method method) 
  {
	  System.out.println(method.getName());
  }
  
}
