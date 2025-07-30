package july16;

import java.util.Scanner;

public class Customer 
{
    String cusname;
	String bankname;
	int accnum;
	String location;
	
	void display()
	{
		System.out.println(cusname+" "+bankname+" "+accnum+" "+location);
	}
		public static void main(String[] args)
		{
		
	    Scanner sc = new Scanner(System.in);
	     
	    System.out.println("Enter your name");
	    String nam1 = sc.next();
	    
	    System.out.println("Enter bank name");
	    String b1 = sc.next();
	    
	    System.out.println("Enter your account number");
	    int a1 = sc.nextInt();
	    
	    System.out.println("Enter bank location");
	    String l1 = sc.next();
	    
	    
	    
	    System.out.println("Enter your name");
	    String nam2 = sc.next();
	    
	    System.out.println("Enter bank name");
	    String b2 = sc.next();
	    
	    System.out.println("Enter your account number");
	    int a2 = sc.nextInt();
	    
	    System.out.println("Enter bank location");
	    String l2 = sc.next();
	    
	    Customer c1 = new Customer();
	    c1.cusname = nam1;
	    c1.bankname = b1;
	    c1.accnum = a1;
	    c1.location = l1;
	    
	    Customer c2 = new Customer();
	    c2.cusname = nam2;
	    c2.bankname = b2;
	    c2.accnum = a2;
	    c2.location = l2;
	    
	    c1.display();
	    c2.display();
	    
	}
	
}
