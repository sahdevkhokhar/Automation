package Assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertClass 
{

	@Test
	public void testAdd()
	{
		int num = 10;
		String str = "abc";
		
		assertEquals ("abc", str);
		
		assertFalse(num > 12);
		
		assertNotNull(str);
	}
	
	public static void main(String[] args) 
	{
	
		Result result = JUnitCore.runClasses(AssertClass.class);
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
    
