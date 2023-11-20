package TestNGpkg;

import org.testng.annotations.Test;

public class Grouping {

	
	
	
	@Test(priority='1',groups= {"smoke"})
	public void m1() {
		System.out.println("Smoke");
		
	}
	@Test(priority='2',groups= {"Regression"})
	public void m2() {
		System.out.println("Regression");
		
	}
	@Test(priority='3',groups= {"functional"})
	public void m3() {
		System.out.println("functional");
		
	}
	@Test(priority='4',groups= {"functional"})
	public void m4() {
		System.out.println("functional");
		
	}
	@Test(priority='5',groups= {"Regression"})
	public void m5() {
		System.out.println("Regression");
		
	}
}
