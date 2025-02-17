package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class SearchTest1 
{
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1)
  public void searchWithValidProduct(Method method) 
  {
	  System.out.println(cName + " - "+ method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2)
  public void searchWithInValidProduct(Method method) 
  {
	  System.out.println(cName + " - "+ method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3)
  public void searchWithEmptyProduct(Method method) 
  {
	  System.out.println(cName + " - "+ method.getName() + " - " + Thread.currentThread().getId());
  }
  
}
