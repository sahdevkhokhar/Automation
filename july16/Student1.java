package july16;

import java.util.Scanner;

public class Student1 
{

	int id;
	String name;
	String email;
	
	public static void main(String[] args) 
	{
	     Scanner sc = new Scanner(System.in);
	     
	        System.out.println("Enter Your Id");
		    int i1 = sc.nextInt();
		    
		    System.out.println("Enter Your Name");
		    String n1 = sc.next();
		    
		    System.out.println("Enter Your Email");
		    String e1 = sc.next();
	     
	    
		Student s1 = new Student();
		s1.id=i1;
		s1.name=n1;
		s1.email=e1	;
		
		
		Student s2 = new Student();
		s2.id=102;
		s2.name="Manthan";
		s2.email="m@gmail.com";
		
		System.out.println(s1.id+" "+s1.name+" "+s1.email);
		System.out.println(s2.id+" "+s2.name+" "+s2.email);
		
	}
}
