package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import Math.MathFunction;

public class NewTest {
	MathFunction mathUtil = new MathFunction();
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class!");		
	}
	
  @Test
  public void f() {
	  System.out.println("This is a TestNG test case");
	  int addResult = mathUtil.add(3, 4);
	  Assert.assertEquals(addResult, 7);
	 
  }
  
  @Test(expectedExceptions = ArithmeticException.class)
  public void exception(){
	  int except = 3 / 0;
  }
  
  @AfterClass
  public void afterClass(){
	  System.out.println("after class!");
  }
}
