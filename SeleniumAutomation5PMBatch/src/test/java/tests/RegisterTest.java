package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class RegisterTest 
{
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1)
  public void registerWithMandatoryFileds(Method method) 
  {
	  System.out.println(cName + " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2)
  public void registerWithAllFileds(Method method) 
  {
	  System.out.println(cName + " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3)
  public void registerWithDuplicateFileds(Method method) 
  {
	  System.out.println(cName + " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 4)
  public void registerWithEmptyFileds(Method method) 
  {
	  System.out.println(cName + " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
}
