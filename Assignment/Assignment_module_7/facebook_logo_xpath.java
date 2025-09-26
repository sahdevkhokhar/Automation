package Assignment_module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebook_logo_xpath 
{
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException 
{

	driver = DriverConnection.getconnect("https://www.facebook.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[1]/div/div[1]/h1/a/i")).click();
	
	
}
}