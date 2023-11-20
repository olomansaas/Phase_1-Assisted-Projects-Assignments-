package TestNGpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	
	WebDriver driver;
	
	@Test
	public void wiki() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.close();
	}
	@Test
	public void mmt() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.close();
	}
	@Test
	public void google() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com//");
		driver.close();
	}

}


XML

	<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Parallel Concept" parallel="methods" verbose="1" thread-count="3">
	<test name="Test Cycle 1">
		<classes>
			<class name="TestNGpkg.Parallel">
				<methods>
					<include name="wiki"></include>
					<include name="mmt"></include>
					<include name="google"></include>
				</methods>
			</class>
		</classes>
	</test>
</suite>
