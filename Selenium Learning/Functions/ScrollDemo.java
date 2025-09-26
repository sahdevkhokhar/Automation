package Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Assignment_module_7.DriverConnection;

public class ScrollDemo 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = DriverConnection.getconnect("https://www.facebook.com/");
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//WebElement ele  =driver.findElement(By.linkText("Create new account"));
		
		//js.executeScript("window.scrollBy(0,80)");
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		
		
	}
	
}
