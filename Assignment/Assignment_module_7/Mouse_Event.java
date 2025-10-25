package Assignment_module_7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Event 
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver = DriverConnection.getconnect("https://demo.automationtesting.in/Index.html");
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(1500);
	WebElement Home = driver.findElement(By.linkText("Home"));
	WebElement Register = driver.findElement(By.linkText("Register"));
	WebElement WebTable = driver.findElement(By.linkText("WebTable"));
	WebElement SwitchTo = driver.findElement(By.linkText("SwitchTo"));
	WebElement Widgets = driver.findElement(By.linkText("Widgets"));
	WebElement Interactions = driver.findElement(By.linkText("Interactions"));
	WebElement Video = driver.findElement(By.linkText("Video"));
	WebElement WYSIWYG = driver.findElement(By.linkText("WYSIWYG"));
	WebElement More = driver.findElement(By.linkText("More"));
	WebElement PracticeSite = driver.findElement(By.linkText("Practice Site"));
	
	Actions builder = new Actions (driver);
	builder.moveToElement(Home).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(Register).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(WebTable).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(SwitchTo).build().perform();
	Thread.sleep(1000);
//	String mainwin = driver.getWindowHandle();
//	System.out.println(mainwin);
//    driver.findElement(By.linkText("Frames")).click();
//    Thread.sleep(3000);
//    
//    Set<String> allwins = driver.getWindowHandles();
//    for(String win : allwins)
//    {
//    	if(!win.equals(mainwin))
//    	{
//    		driver.switchTo().window(win);
//    		
//    		driver.close();
//    		driver.switchTo().window(mainwin);
//    	}
    	
  //  }
	
	builder.moveToElement(Widgets).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(Interactions).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(Video).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(WYSIWYG).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(More).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(PracticeSite).build().perform();
	Thread.sleep(1000);
}
}
