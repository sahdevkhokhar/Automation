package Function;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Assignment_module_7.DriverConnection;

public class MultipleWindow 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = DriverConnection.getconnect("http://demo.guru99.com/popup.php");
		
		String mainwin = driver.getWindowHandle();
		System.out.println(mainwin);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allwins = driver.getWindowHandles();
		for(String win : allwins)
		{
			if(!win.equals(mainwin))
			{
				driver.switchTo().window(win);
				
		driver.findElement(By.name("emailid")).sendKeys("sahdev.khkhr@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
		driver.close();
		
		driver.switchTo().window(mainwin);
		
        driver.close();
		
		Thread.sleep(2000);
		
		driver.quit();
		
				
			}
		}
		
	}
}
