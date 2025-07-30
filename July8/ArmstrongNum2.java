package July8;


public class ArmstrongNum2
{
public static boolean checknum(int num)
{
	int originalnum = num;
	int sumofpower = 0;
	int numofdigits = String.valueOf(num).length();
	
	while(num>0)
	{
		int digit = num%10;
		sumofpower+=Math.pow(digit,numofdigits);
		num/=10;
		
	}
	
	return originalnum ==sumofpower;
}
public static void main(String[] args) {
	 int num = 1234;
	 int num2 = 370;
	 int num3 = 465;
	 System.out.println(checknum(num));
	 System.out.println(checknum(num2));
	 System.out.println(checknum(num3));
	 
}

	
	
}

