package July3;

import java.util.Scanner;

public class Scan_SwitchEx 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please Enter Your Number");
	
	int num = sc.nextInt();

	switch(num)
	{
	case 1: System.out.println("Your selected language is English");
	break;
	
	case 2: System.out.println("Your selected language is hindi");
	break;
	
	case 3: System.out.println("Your selected language is Gujarati");
	break;
	
	default : System.out.println("Your number is not valid");
	break;
	
	
	}
}
}
