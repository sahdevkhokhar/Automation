package Exception_Array_Wrap;

public class ExceptionEx1
{
public static void main(String[] args)
{
	

	try
	{
		int num = 10/0;
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