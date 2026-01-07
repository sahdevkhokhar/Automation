package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook_login 
{

	static WebDriver driver;
	
	@BeforeMethod
	
		public static void openBrowser()
		{
			 driver= DriverConnection.getconnect("https://www.facebook.com/");
		}
	
	@Test
	
	public static void logintest() throws InterruptedException
	{
		Thread.sleep(2500);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123");
	}
	
	@AfterMethod
	
	public static void closebrowser()
	{
		if (driver != null)
		{
			driver.quit();
		}
	}
	
}
