package testNGpack;

import java.util.Random;

import org.testng.annotations.Test;

public class InvocationCountTest 
{
	
  @Test(invocationCount = 5,threadPoolSize = 5,invocationTimeOut = 100)
  public void invocationCount() throws Exception 
  { 
	  Random r = new Random();
	  int rNum = r.nextInt(99);
	  System.out.println("Random Number is : "+ rNum +" - Thread: " + Thread.currentThread().getId());
  }
  
}
