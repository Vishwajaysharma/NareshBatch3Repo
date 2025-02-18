package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class RegisterTest 
{
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1,groups = {"smoke","sanity","regression","register","all"})
  public void registerWithMandatoryFileds(Method method) 
  {
	  System.out.println(cName + " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2,groups = {"smoke","regression","register","all"})
  public void registerWithAllFileds(Method method) 
  {
	  System.out.println(cName + " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3,groups = {"regression","register","all"})
  public void registerWithDuplicateFileds(Method method) 
  {
	  System.out.println(cName + " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 4,groups = {"regression","register","all"})
  public void registerWithEmptyFileds(Method method) 
  {
	  System.out.println(cName + " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
}
