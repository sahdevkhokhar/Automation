package Assignment_module_6;

import java.util.Scanner;

public class gretestoutof3 
{

	public static void main(String[] args)
	{
	
		 Scanner sc = new Scanner(System.in);
		 int a,b,c,gretest;
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 
		 if(a>=b && a>=c)
		 {
			 gretest = a;
		 }
		 
		 else if (b>=a && b>=c)
		 {
			 gretest = b;
		 }
		 else
		 {
			gretest = c; 
		 }
		System.out.println("Gretest number is :" +gretest);
	}
}
