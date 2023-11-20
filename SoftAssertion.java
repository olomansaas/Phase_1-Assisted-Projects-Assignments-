package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		
	}
	@Test
	public void getTitle() {
		
		SoftAssert Soft=new SoftAssert();
		String Expected="Your Storiees";
		String Actual=driver.getTitle();
		
		
		//Soft Assertion -just capture the result and move on.
		
		Soft.assertEquals(Actual, Expected);
		driver.findElement(By.name("search")).sendKeys("mac");

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		
	}
	
	}
