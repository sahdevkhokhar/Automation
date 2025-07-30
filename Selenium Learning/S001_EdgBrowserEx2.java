import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class S001_EdgBrowserEx2
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.edge.driver", "E:\\Driver_Notes\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://careercenter.tops-int.com/");
	}
	
}
