package Assignment_module_6;

abstract class parent
{
public abstract void message();	
}

class Firstsubclass extends parent
{

	@Override
	public void message() 
	{
		System.out.println("This is first subclass");
		
	}
	}

class Secoundsubclass extends parent
{

	@Override
	public void message() 
	{
		System.out.println("This is secound subclass");
		
	}
	}

public class Overriding 
{

	public static void main(String[] args) 
	{
	Firstsubclass first = new Firstsubclass();
	first.message();
	
	Secoundsubclass secound = new Secoundsubclass();
	secound.message();
	}
}
