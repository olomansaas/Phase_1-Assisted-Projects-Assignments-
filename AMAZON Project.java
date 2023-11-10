package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {

	public static void main(String[] args) throws InterruptedException, IOException {
		// System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		// Navigate to Amazon homepage
		driver.get("https://amazon.in/");
		Thread.sleep(2000);
		
		File srcFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		File destFile1 = new File("./Screenshots/1.png");
		FileUtils.copyFile(srcFile1, destFile1);

		
		// Verify user is signed in.
		WebElement signInButton = driver.findElement(By.id("nav-link-accountList"));
		signInButton.click();
		WebElement emailInput = driver.findElement(By.id("ap_email"));
		emailInput.sendKeys("9306747811");
		
		File srcFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		File destFile2 = new File("./Screenshots/2.png");
		FileUtils.copyFile(srcFile2, destFile2);

		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		WebElement passwordInput = driver.findElement(By.id("ap_password"));
		passwordInput.sendKeys("Lala@121");
		
		File srcFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		File destFile3 = new File("./Screenshots/3.png");
		FileUtils.copyFile(srcFile3, destFile3);

		
		WebElement signInSubmitButton = driver.findElement(By.id("signInSubmit"));
		signInSubmitButton.click();

		// wait condition to Check whether user get success in signing in.
		Thread.sleep(2000);

		// Scrolling the page using javaExecutor method
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		
		File srcFile4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		File destFile4 = new File("./Screenshots/4.png");
		FileUtils.copyFile(srcFile4, destFile4);

		

		// Search for a product.
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iPhone 13");
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		
		File srcFile5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		File destFile5 = new File("./Screenshots/5.png");
		FileUtils.copyFile(srcFile5, destFile5);

		

		// Apply filters are applied 1.-->Storage (128gb) 2.-->Processor Speed (2.5GHz
		// and Above)
		WebElement filterElement1 = driver
				.findElement(By.xpath("//*[@id=\"p_n_feature_twenty-nine_browse-bin/81332994031\"]/span/a/span"));
		filterElement1.click();

		WebElement filterElement2 = driver
				.findElement(By.xpath("//*[@id=\"p_n_feature_nine_browse-bin/8561127031\"]/span/a/span"));
		filterElement2.click();
		
		File srcFile6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		File destFile6 = new File("./Screenshots/6.png");
		FileUtils.copyFile(srcFile6, destFile6);

		

		// Choose First product After Applying Filter.
		WebElement productElement = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		productElement.click();

		Thread.sleep(5000);

		// Get the list of window handles And Use the list of window handles to switch between windows.
		String windowHandle = driver.getWindowHandle();
		ArrayList tabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) tabs.get(1));

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		
		File srcFile7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		File destFile7 = new File("./Screenshots/7.png");
		FileUtils.copyFile(srcFile7, destFile7);


		WebElement wishlist1 = driver.findElement(By.xpath("//*[@id=\"wishListMainButton\"]"));
		wishlist1.click();
		
		
		

		((JavascriptExecutor) driver).executeScript("alert('WishList Created')");
		
		File srcFile8 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		File destFile8 = new File("./Screenshots/8.png");
		FileUtils.copyFile(srcFile8, destFile8);

		

		driver.close();
	}
}