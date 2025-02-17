package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LoginTest 
{
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1)
  public void loginwithValidCredientials(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2)
  public void loginwithInvalidUser(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3)
  public void loginwithInvalidpassword(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 4)
  public void loginwithInValidCredientials(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 5)
  public void loginwithEmptyFields(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
}
