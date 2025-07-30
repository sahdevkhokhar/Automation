package July8;

import java.util.Scanner;

public class factorialEx 
{
 

	public static void main(String[] args)
	{
	System.out.println("Enter any numbe");
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	int factorial=1;
	for(int i=1;i<=num;i++)
	{

	factorial=factorial*i;
	}
		System.out.println(+factorial);
	
		
	}	
	}

