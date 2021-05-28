package testNgPractice;

import org.testng.annotations.Test;

public class webTest {
	int numberoftest;
	public webTest(int numberoftest) {
		super();
		this.numberoftest = numberoftest;
	}
	
	@Test
	public void test1() {
		System.out.println("The Test Parameter is : " + numberoftest);
	}
	
	
}
