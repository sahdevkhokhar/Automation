package Assignment_module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_with_demo_automationRegister 
{
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
	
		driver=DriverConnection.getconnect("https://demo.automationtesting.in/Index.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("sahdev.khkhr@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"enterimg\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("sahdev");
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("khokhar");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Street no.7, opp. Somnath Mahadev temple, Munjka");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("sahdev.khkhr@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9712717790");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		
		//driver.findElement(By.id("Languages")).sendKeys("English,Hindi,Gujarati");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[65]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("india");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]")).click();
		
		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByVisibleText("1990");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[8]")).click();
		
		Thread.sleep(1000);
		
		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByVisibleText("17");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("firstpassword")).sendKeys("Mahadev2025");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("secondpassword")).sendKeys("Mahadev2025");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("submitbtn")).click();
		
	
	}
}
