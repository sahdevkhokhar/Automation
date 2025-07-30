package july18;

import java.util.Scanner;

public class Student03
{

	int i;
	String n;
	
	public Student03(int id,String name)
	{
		
		i = id;
		n = name;	
	}
	
	void display()
	{
		System.out.println("Your id is "+i+" and your name is "+n);			
	}
	
	public static void main(String[] args) 
	{
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your id");
		int i1 = sc.nextInt();
		
		System.out.println("Enter your name");
		String n1 = sc.next();
		
		System.out.println(" Enter your id");
		int i2 = sc.nextInt();
		
		System.out.println("Enter your name");
		String n2 = sc.next();
		
		Student03 s1 = new Student03(i1, n1);
		Student03 s2 = new Student03(i2,n2);
        s1.display();
		s2.display();
		
	}
	
	
}



