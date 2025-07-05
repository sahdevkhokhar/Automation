package July3;

import java.util.Scanner;

public class Scan_reversnum 
{
public static void main(String[] args) 
{
	

	int num;
	int reversenum = 0;
	int reminder;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Type any number");
	num = sc.nextInt();
	
	System.out.println("Reverse number of :" +num);
	
	while(num !=0)
		{
		reminder = num%10;
		reversenum = reversenum*10+reminder;
		num = num/10;
		}
		
	System.out.println(reversenum);
	

}

}