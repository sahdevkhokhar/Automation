package July3;

import java.util.Scanner;

public class SimpleIntExWithScanner 
{

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		int prin,rate,year;
		
		System.out.println("Enter Prin Amount: ");
		prin= sc.nextInt();
		
		System.out.println("Enter rate of intrest: ");
		rate= sc.nextInt();
		
		System.out.println("Enter Year: ");
		year = sc.nextInt();
		
		int intrest = prin*rate*year/100;
		
		System.out.println("You have to pay toatal intrest: "+intrest);
		
		int ans = intrest+prin;
		
		System.out.println("You have to pay total amount: "+ans);
			
		}
		
	}


	
	

