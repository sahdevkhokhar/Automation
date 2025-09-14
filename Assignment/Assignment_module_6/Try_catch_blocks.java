package Assignment_module_6;

public class Try_catch_blocks
{
public static void main(String[] args)
{
	

	try
	{
		int num = 50/0;
		System.out.println(num);
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	finally
	{
		System.out.println("sucess");
	}

}
}