package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.http.impl.execchain.MainClientExec;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Assignment_module_7.DriverConnection;

public class ScreenshotEx 
{

	public static void getScreenShot(WebDriver driver,String imgname)
	
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\Automation\\"+imgname+".png");
		
		try
		{
			FileUtils.copyFile(source,dest);
		}
		
		catch (IOException e)
		{
		
		e.printStackTrace();
		}
		
		System.out.println("screenshot taken");
		
	}
	
	public static void main(String[] args)
	{
	
		WebDriver driver = DriverConnection.getconnect("https://demoqa.com/automation-practice-form");
		getScreenShot(driver, "error");
	}
	
}
