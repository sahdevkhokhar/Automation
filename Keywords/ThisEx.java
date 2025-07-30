package Keywords;

//This keyword is used to print variabl's value when it's having same name

public class ThisEx 
{

	String name;
	String surname;
	
	public ThisEx(String name,String surname)
	{
		this.name = name;
		this.surname = surname;
	}
	
	void display()
	{
		
		System.out.println(name+" "+surname);
	}
	
	public static void main(String[] args)
	{
		
		ThisEx k1 = new ThisEx("Sahdev","Khokhar");
				k1.display();
	}
}
