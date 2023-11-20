
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


xml files


	<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="This is a grouping file">
	<test name="Grouping" verbose="1">
		<groups>
			<run>
				<include name="smoke"></include>
			</run>
		</groups>
		<classes>
			<class name="TestNGpkg.Grouping"></class>
			<class name="TestNGpkg.Grouping2"></class>
			
		</classes>
	</test>
	
	<test name="Regression" verbose="1">
		<groups>
			<run>
				<include name="Regression"></include>
			</run>
		</groups>
		<classes>
			<class name="TestNGpkg.Grouping"></class>
			<class name="TestNGpkg.Grouping2"></class>
			
		</classes>
	</test>
</suite>
