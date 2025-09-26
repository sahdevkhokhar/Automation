package ScreenShots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice_Form 
{

	public static void main(String[] args) throws InterruptedException 
	{
	      System.setProperty("webdriver.chrome.driver","F:\\chromedriver-win64.\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      
	      driver.get("https://demoqa.com/automation-practice-form");
	      driver.manage().window().maximize();
	      js.executeScript("window.scrollBy(0,100)");
	      driver.findElement(By.id("firstName")).click();
	      driver.findElement(By.id("firstName")).sendKeys("Sahdev");
	      driver.findElement(By.id("lastName")).click();
	     
		  Thread.sleep(1000);
			
	      driver.findElement(By.id("lastName")).sendKeys("Khokhar");
	      Thread.sleep(1000);
	      
	      WebElement element = driver.findElement(By.id("userEmail"));
	      
	      js.executeScript("arguments[0].scrollIntoView();", element);
	      
	      driver.findElement(By.id("userEmail")).click();
	      
		  Thread.sleep(1500);
		
	      driver.findElement(By.id("userEmail")).sendKeys("sahdev.khkhr@gmail.com");
	     
		  Thread.sleep(1500);
		
	      driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	      
	      driver.findElement(By.id("userNumber")).click();
	      
		  Thread.sleep(1500);
		
	      driver.findElement(By.id("userNumber")).sendKeys("971271779");
	      
	      Thread.sleep(2000);   
	      
	      //Method 1 for calendar
	      
//	      driver.findElement(By.id("dateOfBirthInput")).click();
//	      
//	      Thread.sleep(1000);
//	      
//	      driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[7]")).click();
//	      
//	      Thread.sleep(1000);
//	      
//	      driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[91]")).click();
//	      
//	      Thread.sleep(1000);
//	      
//	      driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]")).click();
//	      
	     
	      String day = "20";
	      String month = "July";
	      String year = "1990";
	      
	      driver.findElement(By.id("dateOfBirthInput")).click();
	      
	      Thread.sleep(1000);
	      
	      WebElement mymonth = driver.findElement(By.className("react-datepicker__month-select"));
	      Select m = new Select(mymonth);
	      m.selectByVisibleText(month);
	      
	      Thread.sleep(1000);
	      
	      WebElement myyear = driver.findElement(By.className("react-datepicker__year-select"));
	      Select y = new Select(myyear);
	      y.selectByVisibleText(year);
	      
	      Thread.sleep(1000);
	      
			List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
	      
	      for(WebElement d : days)
	      {
	    	  if(d.getText().equals(day))
	    	  {  
	    		  d.click();
	    	      break;
	    	  }
	      }
	      
	      
	      WebElement subjects	=driver.findElement(By.id("subjectsContainer"));
		  Actions builder = new Actions(driver);
		  builder.click(subjects).sendKeys("Maths").sendKeys(Keys.ENTER).sendKeys("Physics").sendKeys(Keys.ENTER).build().perform();
	      
	      Thread.sleep(1000);
	      
	      //driver.findElement(By.xpath("hobbies-checkbox-1")).click();
	      
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	      
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
	      
	      Thread.sleep(1000);
	      
	      driver.findElement(By.id("currentAddress")).sendKeys("Street no.7, opp.somanth mahdev temple near saurastra university");
	      
	      Thread.sleep(1000);
	      
	      WebElement selectstate = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
		   Actions builder1 = new Actions(driver);
		   builder1.click(selectstate).sendKeys("Uttar Pradesh").sendKeys(Keys.ENTER).build().perform();
	        
	      Thread.sleep(1000);
	      
	      WebElement selectcity = driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]"));
		  Actions builder2 = new Actions(driver);
		  builder2.click(selectcity).sendKeys("Agra").sendKeys(Keys.ENTER).build().perform();
	      
	      Thread.sleep(1000);
	      
	      driver.findElement(By.id("submit")).click();
	 
	      ScreenshotEx.getScreenShot(driver,"Practice-form");
	      Thread.sleep(1000);
	      driver.quit();
	        
	}        

}
