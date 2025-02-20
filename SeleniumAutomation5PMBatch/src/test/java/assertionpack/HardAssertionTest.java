package assertionpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTest 
{
	
  @Test
  public void f() 
  {
	  String a = "ravikanth";
	  String b = "ravikanth1";
	  
	  //Assert.assertEquals(a, b);
	  //Assert.assertEquals(a, b, "Both are not equal");
	  
	 // Assert.assertTrue(a.equals(b));
	  Assert.assertTrue(a.equals(b), "Both are not equal");
  }
  
}
