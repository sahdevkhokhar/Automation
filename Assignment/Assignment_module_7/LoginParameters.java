package Assignment;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginParameters 
{
	
	static WebDriver driver;
	
	@BeforeMethod
	public static void openBrowser()
	{
		 driver= DriverConnection.getconnect("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) throws InterruptedException
	{
		Thread.sleep(2500);
		
		WebElement uname =  driver.findElement(By.id("email"));
		uname.clear();
		uname.sendKeys(username);
		
		WebElement pass =  driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys(password);
		
        Thread.sleep(3000);
        
        driver.navigate().back();
	}
	
	@AfterMethod
	public void closeBrowser() {
        driver.quit();
	}
	
	@DataProvider(name= "loginData")
	public Object[][] getData()
	{
		return new Object[][]
				{
					{"abc@gmail.com", "abc"},
		            {"xyz@gmail.com", "xyz"},
		            {"tops@gmail.com", "tops"},
		            {"tech@gmail.com", "tech"}
				};
			
	}
	
	
}