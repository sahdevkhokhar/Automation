package Assignment;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLogin 
{

static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser()
	{
		 driver= DriverConnection.getconnect("https://www.facebook.com/");
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		Thread.sleep(2500);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123");
		
	}
}
