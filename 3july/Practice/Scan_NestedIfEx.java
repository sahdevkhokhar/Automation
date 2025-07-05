package July3;

import java.util.Scanner;

public class Scan_NestedIfEx 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your Age");
	
	int age;
	age = sc.nextInt();
	
	if(age>=18)
	{
		System.out.println("Eligibale to vote");
		
			if (age>=60)
			{
				System.out.println("You are under senior citizen category");
		}
		else
			{
				System.out.println("You are under young age category");
			}
	}
		else
		{
			System.out.println("You are not eligible to vote");
		}
			
	}
	}


