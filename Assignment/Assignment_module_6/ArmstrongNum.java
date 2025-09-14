package Assignment_module_6;

import java.util.Scanner;

public class ArmstrongNum
{
public static void main(String[] args) 
{
	int n,arm=0,rem,c;
	System.out.println("Enter Any Number");
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();
	c=n;
	
	while(n>0)
	{
		rem = n%10;
		arm = (rem*rem*rem)+arm;
		n=n/10;
	}
	
	if(c==arm)
		System.out.println("It is a armstrong number");
	else
		System.out.println("It is not a armstrong number");
	
	
}
}
