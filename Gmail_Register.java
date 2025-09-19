package Assignment_module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Register 
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=http://support.google.com/accounts/answer/27441?hl%3Den%26co%3DGENIE.Platform%253DDesktop&dsh=S17396365:1757912877811430&ec=GAZAdQ&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&ifkv=AdBytiN-gJB31wC0DKtDo2pUM5CScJLnHiZRPvNX6Cv9hi_cW7gMzVoJb-8Os1t8ZkT54emAvjzWtA&TL=AMbiOORhraUx3P1ZPpVCo4EDS0iti0wbGNgjR2bdLMOneAueZz8xfrTaCeC9-TLa");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/main/div[3]/div/div/div/div/button/span")).click();
	driver.manage().window().maximize();
	driver.findElement(By.id("firstName")).sendKeys("sahdev");
	Thread.sleep(1000);
	driver.findElement(By.id("lastName")).sendKeys("khokhar");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
	
	Thread.sleep(1500);
	
	driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[1]/div")).click();	
	driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[2]/ul/li[7]")).click();
	
	Thread.sleep(1000);
	
    driver.findElement(By.id("day")).sendKeys("17");
	
    Thread.sleep(1000);
	
	driver.findElement(By.id("year")).sendKeys("1994");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"gender\"]/div/div[1]/div")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"gender\"]/div/div[2]/ul/li[2]")).click();
	
    //Select gender = new Select(driver.findElement(By.id("gender")));
    //gender.selectByVisibleText("Male");
    
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/main/div[2]/div/div/div/form/span/section/div/div/div[3]/button")).click();
    
    Thread.sleep(1000);
   
    //driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[2]/div[2]/div/div[1]/div/div/div/span/div[4]/a")).click();
   
    //Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[2]/div[2]/div/div[2]/button/span")).click();
    
    Thread.sleep(1000);
    
    
    
    driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
    
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[@id=\"selectionc21\"]")).click();
    
    Thread.sleep(1000);
    //driver.findElement(By.id("selectionc22")).click();	
	
    //Thread.sleep(1000);
    
//    driver.findElement(By.name("Username")).sendKeys("sahdevkhokhar23");
//    
//    Thread.sleep(1000);
//    
//    driver.findElement(By.name("Passwd")).sendKeys("Mahadev2025");
//    
//    Thread.sleep(1000);
//    
//    driver.findElement(By.name("PasswdAgain")).sendKeys("Mahadev2025");
//    
//    Thread.sleep(1000);
//    
//    driver.findElement(By.id("selectionc27")).click();
//    
//    Thread.sleep(1000);
//    
//    driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span")).click();
//    
}
}
