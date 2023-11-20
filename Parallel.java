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
