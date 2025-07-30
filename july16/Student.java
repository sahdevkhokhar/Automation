package july16;

public class Student
{

	int id;
	String name;
	String email;
	
public static void main(String[] args) {


Student s1 =new Student();
s1.id=101;
s1.name ="Manthan";
s1.email = "m@gmail.com";

Student s2 =new Student();
s2.id=100;
s2.name ="Sahdev";
s2.email = "s@gmail.com";
System.out.println(s1.id+" "+s1.name+" "+s1.email);
System.out.println(s2.id+" "+s2.name+" "+s2.email);
}
}	