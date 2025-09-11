package Assignment_module_6;

import java.util.Scanner;

public class factorialEx // 5!= 5*4*3*1 = 120
{
 

	public static void main(String[] args)
	{
	System.out.println("Enter any numbe");
	Scanner sc = new Scanner(System.in);
	
    double num = sc.nextInt();
	double factorial=1.00;
	for(int i=1;i<=num;i++)
	{

	factorial=factorial*i;
	}
		System.out.println(+factorial);
	
		
	}	
	}

