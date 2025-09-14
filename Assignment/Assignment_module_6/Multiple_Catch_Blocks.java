package Assignment_module_6;

public class Multiple_Catch_Blocks 
{
public static void main(String[] args) 
{

	try
	{   
		int arr[] = new int [6];
		arr[6] = 8;
		int a=10,b=0;
		int c=a/b;
		System.out.println(c);
		
	}
	
	
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println(ex);
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}
