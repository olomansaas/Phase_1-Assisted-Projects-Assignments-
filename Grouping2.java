package TestNGpkg;

import org.testng.annotations.Test;

public class Grouping2 {

	
	
	
	@Test(priority='1',groups= {"smoke"})
	public void m12() {
		System.out.println("Smoke");
		
	}
	@Test(priority='2',groups= {"Regression"})
	public void m21() {
		System.out.println("Regression");
		
	}
	@Test(priority='3',groups= {"functional"})
	public void m31() {
		System.out.println("functional");
		
	}
	@Test(priority='4',groups= {"functional"})
	public void m41() {
		System.out.println("functional");
		
	}
	@Test(priority='5',groups= {"Regression"})
	public void m51() {
		System.out.println("Regression");
		
	}
}
		