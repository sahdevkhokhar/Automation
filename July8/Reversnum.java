package July8;

import java.util.Scanner;

public class Reversnum 
{

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any Number");
	 
	int num = sc.nextInt();
	int revnum = 0;
	
	while(num>0)
	{
		int remin = num%10;
		revnum = (revnum*10)+remin;
		num = num/10;
	}
		System.out.println("Reverse Number is : "+revnum );
		
	}
}
