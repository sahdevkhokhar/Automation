package Assignment_module_6;

public class FibonaccciSeries //1+2+3+5+8
{

	public static void main(String[] args)
	{
	
	int limit=50,num1=0,num2=1;
	while (num1<=limit)
	{
		System.out.println(num1);
		
		int sum = num1+num2;
		num1 = num2;
		num2 = sum;
	}
		
		}
	}

