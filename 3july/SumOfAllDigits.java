package July3;

import java.util.Scanner;

public class SumOfAllDigits 
{

	public static void main(String[] args) 
	{
	
		int num,sum=0;
		
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num>0)
		{
			int rem = num%10;
			sum+=rem;
			num=num/10;
		
		}
          System.out.println(sum);		
		
		
		
		
	}
}
