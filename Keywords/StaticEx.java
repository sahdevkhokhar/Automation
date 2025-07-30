package Keywords;

public class StaticEx 
{

	String name;
	String name2;
	static String name3 = "Rajkot";
	
	public StaticEx(String name,String name2)
	{
		this.name = name;
		this.name2 = name2;
	}
	
	void display()
	{
		
		System.out.println(name+" "+name2+" "+name3);
	}
	
	
	static void change()
	{
		
		name3 = "Baroda";
	}
	public static void main(String[] args) 
	{
		change();
		
	StaticEx s1 = new StaticEx("a", "b");
	StaticEx s2 = new StaticEx("c", "d");
	
	      s1.display();
	      s2.display();
	}
}
