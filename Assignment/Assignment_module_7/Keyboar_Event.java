package Assignment_module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboar_Event 
{
public static void main(String[] args) throws InterruptedException 
{
	//Example 1
//WebDriver driver = DriverConnection.getconnect("https://www.google.com/");
//
//WebElement search = driver.findElement(By.name("q"));
//Actions builder = new Actions (driver);
//builder.click(search);
//builder.keyDown(Keys.SHIFT).sendKeys("keyboard event in selenium webdriver")
//.keyUp(Keys.SHIFT)
//.sendKeys(Keys.ENTER)
//.build().perform();

     // Example 2

WebDriver driver = DriverConnection.getconnect("https://extendsclass.com/text-compare.html");
WebElement sourcetaxarea =driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[2]/pre"));
WebElement destinationtaxarea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[2]/pre"));

Actions builder = new Actions (driver);
builder.click(sourcetaxarea);
builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
Thread.sleep(2000);
builder.click(destinationtaxarea);
builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();


}
}
