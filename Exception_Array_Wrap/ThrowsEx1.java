package Exception_Array_Wrap;



public class ThrowsEx1 
{

	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is not valid");
		}
		
		else
		{
			System.out.println("Welcome to vote");
		}
			
	}
	
	public static void main(String[] args) {
		
		validate(9);
	}
}
