package July8;

import java.util.Scanner;

public class EvenOddNum 
{
public static void main(String[] args) 
{

	System.out.println("Enter any number");
	int num;
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	while(num<=50)
	{
		System.out.println(num);
		num=num+2;
	
	}
	
}
}
