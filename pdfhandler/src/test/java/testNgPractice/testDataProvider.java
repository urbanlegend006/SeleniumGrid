package testNgPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDataProvider {
  @Test(dataProvider = "test2",  groups = "A")
  public void functionTest(int n) {
  System.out.println("The provided number is : " + n);
  }
  
  @Test(dataProvider = "test1",  groups = "B")
  public void functionTest1(int n) {
  System.out.println("The provided number is : " + n);
  }


@DataProvider(name="test1")

public Object[][] returnData() {

	return new Object[][] {
		
		new Object[] {new Integer(42)}
		};
	}

@DataProvider(name="test2")

public Object[][] returnData1() {

	return new Object[][] {
		
		{new Integer(42)},
		{new Integer(52)},
		{new Integer(62)},
		};
	}

}
