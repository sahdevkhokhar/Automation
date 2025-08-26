import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S002_Practice_Form
{
public static void main(String[] args) 
{
      System.setProperty("webdriver.chrome.driver","F:\\chromedriver-win64.\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      
      driver.get("https://demoqa.com/automation-practice-form");
      driver.manage().window().maximize();
      driver.findElement(By.id("firstName")).click();
      driver.findElement(By.id("firstName")).sendKeys("Sahdev");
      driver.findElement(By.id("lastName")).click();
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      driver.findElement(By.id("lastName")).sendKeys("Khokhar");
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      WebElement element = driver.findElement(By.id("userEmail"));
      js.executeScript("arguments[0].scrollIntoView();", element);
      driver.findElement(By.id("userEmail")).click();
      try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      driver.findElement(By.id("userEmail")).sendKeys("sahdev.khkhr@gmail.com");
      try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
      
      driver.findElement(By.id("userNumber")).click();
      try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      driver.findElement(By.id("userNumber")).sendKeys("9712717790");
      driver.findElement(By.id("dateOfBirthInput")).click();
      
    
      
      
}        
}
