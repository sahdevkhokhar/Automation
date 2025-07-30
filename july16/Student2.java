package july16;

import java.util.Scanner;

public class Student2
{

	int id;
	String name;
	String email;
	
	void display()
	{
		
	System.out.println(id+" "+name+" "+email);
	}
	
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id");
		int i1 = sc.nextInt();
		
		System.out.println("Enter your name");
		String n1 = sc.next();
		
		System.out.println("Enter your email");
		String ne = sc.next();
		
		
		Student2 s1 = new Student2();
		s1.id = i1;
		s1.name = n1;
		s1.email = ne;
		
		Student2 s2 = new Student2();
		s2.id = 102;
		s2.name = "sahdev";
		s2.email = "s@gmail.com";
		
        s1.display();
        s2.display();
	
		
		
	}
	
}
