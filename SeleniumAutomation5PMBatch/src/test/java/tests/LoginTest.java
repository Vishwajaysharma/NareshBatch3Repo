package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LoginTest 
{
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1,groups = {"smoke","sanity","regression","login","all"})
  public void loginwithValidCredientials(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2,groups = {"sanity","regression","login","all"})
  public void loginwithInvalidUser(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3,groups = {"regression","login","all"})
  public void loginwithInvalidpassword(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 4,groups = {"regression","login","all"})
  public void loginwithInValidCredientials(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 5,groups = {"regression","login","all"})
  public void loginwithEmptyFields(Method method) 
  {
	  System.out.println(cName + " - " + method.getName()+ " - " + Thread.currentThread().getId());
  }
  
}
