package Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Assignment_module_7.DriverConnection;

public class MouseEvent 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = DriverConnection.getconnect("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		WebElement Bestsellers = driver.findElement(By.linkText("Bestsellers"));
		WebElement Fresh = driver.findElement(By.linkText("Fresh"));
		
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(sell).build().perform();
		Thread.sleep(1000);
		builder.moveToElement(mobiles).build().perform();
		Thread.sleep(1000);
		builder.moveToElement(Bestsellers).build().perform();
		Thread.sleep(1000);
		builder.moveToElement(Fresh).build().perform();
		
		
		
		
	}
}
