package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertDemoEx 
{
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
	
		 driver = DriverConnection.getconnect("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		//WebElement elm1 = driver.findElement(By.id("alertButton"));
		//elm1.click();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//WebElement elm2 = driver.findElement(By.id("timerAlertButton"));
		//elm2.click();
		//wait.until(ExpectedConditions.alertIsPresent());
		//Alert alert = driver.switchTo().alert();
		//Thread.sleep(1000);
		//alert.accept();
		
		//WebElement elm3 = driver.findElement(By.id("confirmButton"));
		//elm3.click();
		//Alert alert = driver.switchTo().alert();
		//Thread.sleep(1000);
		//alert.accept();
		//alert.dismiss();
		
		WebElement elm4 = driver.findElement(By.id("promtButton"));
		elm4.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("welcome");
		alert.accept();
		
		
		
		
	}
}
