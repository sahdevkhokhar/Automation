import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class S001_BrowserEx
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://careercenter.tops-int.com/");
	}
	
}
