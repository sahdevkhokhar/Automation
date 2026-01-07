package Assignment;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLogin 
{
static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser()
	{
		 driver= DriverConnection.getconnect("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&dsh=S858213253%3A1761567820983589&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=ARESoU0_9mylvwZ6o_v9tQbPrCcI8R3e5QgnIVgJBhjjkcLzVrE-uGmWtXdFkQq7ts8QNCYO1bwuIw&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sahdev.khkhr@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Mahadev$2025");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
}
}
