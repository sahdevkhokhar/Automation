package july18;

public class Student4 
{

	int id;
	String name;
	
	Student4(int i,String n)
	{
		id =i;
		name =n;
	}
	
	Student4(Student4 s1)
	{
		
		System.out.println(s1.id+" "+s1.name);
	}
	
	
	void display()
	{
		
		
		System.out.println("Your id is "+id+" Your name is" +name);
	}
	public static void main(String[] args) 
	{
	Student4 s1 = new Student4(101,"abcd");
	Student4 s2 = new Student4(s1);
	
	
	s1.display();
}
}

