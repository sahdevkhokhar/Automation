package july16;

import java.util.Scanner;

public class Emp
{

	int id;
	String name;
	String surname;
	String email;
	String salary;
	 void display()
	 {
		 
		 System.out.println(id+" "+name+" "+surname+" "+email+" "+salary);
		 
	 }
	 
public static void main(String[] args) 
{

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Id");
    int i1 = sc.nextInt();
    
    System.out.println("Enter Your name");
    String n1 = sc.next();
    
    System.out.println("Enter Your surname");
    String sr = sc.next();
    
    System.out.println("Enter Your email");
    String e1 = sc.next();
    
    System.out.println("Enter Your salary");
    String slr = sc.next();
    
    
    
    System.out.println("Enter Your Id");
    int i2 = sc.nextInt();
    
    System.out.println("Enter Your name");
    String n2 = sc.next();
    
    System.out.println("Enter Your surname");
    String sr2 = sc.next();
    
    System.out.println("Enter Your email");
    String e2 = sc.next();
    
    System.out.println("Enter Your salary");
    String slr2 = sc.next();
    
    Emp em1 =new Emp();
    em1.id=i1;
    em1.name=n1;
    em1.surname=sr;
    em1.email=e1;
    em1.salary=slr;
    
    Emp em2 =new Emp();
    em2.id=i2;
    em2.name=n2;
    em2.surname=sr2;
    em2.email=e2;
    em2.salary=slr2;
//    
    em1.display();
   em2.display();
}
}