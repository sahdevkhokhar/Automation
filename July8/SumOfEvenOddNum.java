package July8;

import java.util.Scanner;

public class SumOfEvenOddNum 
{
public static void main(String[] args) 
{

	System.out.println("Enter range");
	int num,i,sum=0;
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
	if(num%2==0)
	{
		
	for(i=0;i<=num;i=i+2)
	{
	sum=sum+i;
	
	}
	System.out.println("Sum of Even number " +sum);
	}
	else
	{
	for(i=0;i<=num;i=i+2)
	{
		sum=sum+i;
		
	}
	System.out.println("Sum of Odd number" +sum);
	}
	
	}
}
