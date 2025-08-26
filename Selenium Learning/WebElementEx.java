import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementEx 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		
		//data send - 1st way
		
		//WebElement mob = driver.findElement(By.id("mobile"));
		//mob.sendKeys("9712717790");
		//WebElement pass = driver.findElement(By.id("password"));
		//pass.sendKeys("9712717790");
		
		driver.findElement(By.id("mobile")).sendKeys("9712717790");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("9712717790");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"fesDuePopup\"]/div/div/div[1]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[2]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
		//driver.close();
		driver.quit();
	}
}
