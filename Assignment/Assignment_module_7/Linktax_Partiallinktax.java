package Assignment_module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Linktax_Partiallinktax 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = DriverConnection.getconnect("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(1000);
		WebElement Audio = driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span[1]"));
		Actions builder = new Actions (driver);
		builder.moveToElement(Audio).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Sony")).click();
	      
	      
	      
		
	}
}
