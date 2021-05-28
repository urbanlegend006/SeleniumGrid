package testNgPractice;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class testFactoryTest {
  @Factory
  public Object[] createTests() {
	  Object[] result = new Object[10];
	  for(int i=0; i<result.length; i++) {
		  
		  result[i] = new webTest(i);
	  }
	  return result;
  }
  
  /*@Test
  public void runTest1() {
	  createTests();
  }*/
}
