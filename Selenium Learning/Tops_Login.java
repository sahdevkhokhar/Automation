import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tops_Login 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://careercenter.tops-int.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("user_name")).click();
	driver.findElement(By.name("user_name")).sendKeys("9712717790");
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.name("user_password")).click();
	driver.findElement(By.name("user_password")).sendKeys("9712717790");
	
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
     driver.findElement(By.xpath("//*[@id=\"fesDuePopup\"]/div/div/div[2]"));
     driver.findElement(By.xpath("//*[@id=\"fesDuePopup\"]/div/div/div[1]/button")).click();
     try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]")).click();
     driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[4]/a")).click();
     
 	driver.findElement(By.name("user_name")).click();
 	driver.findElement(By.name("user_name")).sendKeys("7862012699");
 	try {
 		Thread.sleep(1500);
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
 	driver.findElement(By.name("user_password"));
 	driver.findElement(By.name("user_password")).sendKeys("7862012699");
 	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
 	driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[1]")).click();
 	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 	driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[4]/a")).click();
}
}
