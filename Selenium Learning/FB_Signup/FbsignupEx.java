package FB_Signup;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FbsignupEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver-win64.\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("Mahadev123");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		Thread.sleep(1000);
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("17");
		
		Thread.sleep(1000);
		
		Select months = new Select(driver.findElement(By.id("month")));
		months.selectByVisibleText("Jul");
		
		Thread.sleep(1000);
		
		Select years = new Select(driver.findElement(By.id("year")));
		years.selectByVisibleText("1990");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		Thread.sleep(1000);
		
	    driver.findElement(By.name("reg_email__")).sendKeys("9712717790");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Mahadev123");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("websubmit")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.quit();
		
		
	
	
		
		
		
		
		
	}
}
