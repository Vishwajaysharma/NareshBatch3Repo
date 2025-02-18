package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class SearchTest 
{
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1,groups = {"smoke","sanity","regression","search","all"})
  public void searchWithValidProduct(Method method) 
  {
	  System.out.println(cName + " - "+ method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2,groups = {"regression","search","all"})
  public void searchWithInValidProduct(Method method) 
  {
	  System.out.println(cName + " - "+ method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3,groups = {"regression","search","all"})
  public void searchWithEmptyProduct(Method method) 
  {
	  System.out.println(cName + " - "+ method.getName() + " - " + Thread.currentThread().getId());
  }
  
}
