package Polymorphism;

public class OverloadingEx2 
{

	int cal(int a,int b)
	{
		return a+b;
	}
	
	double cal(double c,double d)
	{
		return c*d;
	}
	
	public static void main(String[] args) 
	{
	
		OverloadingEx2 o2 = new OverloadingEx2();
		System.out.println(o2.cal(6, 3));
		System.out.println(o2.cal(2.0, 3.0));
	}
}
