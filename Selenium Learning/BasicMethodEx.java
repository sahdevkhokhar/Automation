import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodEx 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		String actualresult = driver.getTitle();
		System.out.println(driver.getTitle());
		String expectedresult = "TOPS Career Center - Welcome to TOPS Technologies";
		
		if(expectedresult.equals(actualresult))
		{
			System.out.println("Verification Successfull - The correct title is displayed on the web page");
			
		}
		else
		{
			System.out.println("Verification failed - An incorrect title displayed on the web page");
		}
	}
}
