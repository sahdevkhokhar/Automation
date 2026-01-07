package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gmail_login 
{

       static WebDriver driver;
		
		@BeforeMethod
		
			public static void openBrowser()
			{
				 driver= DriverConnection.getconnect("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&dsh=S858213253%3A1761567820983589&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=ARESoU0_9mylvwZ6o_v9tQbPrCcI8R3e5QgnIVgJBhjjkcLzVrE-uGmWtXdFkQq7ts8QNCYO1bwuIw&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			}
		
		@Test
		
		public static void logintest() throws InterruptedException
		{
			Thread.sleep(2500);
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sahdev.khkhr@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Mahadev$2025");
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
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
