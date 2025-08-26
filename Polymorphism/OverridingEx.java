package Polymorphism;



	class bank
	{
		int rate()
		{
			return 0;
		}
	}
	
	class sbi extends bank
	{
		int rate()
		{
			return 7;
		}
	}
	
	class icici extends bank
	{
		int rate()
		{
			return 8;
		}
	}
	
	class axis extends bank
	{
		int rate()
		{
			return 9;
		}
	}
	
	public class OverridingEx 
	{
		public static void main(String[] args) 
		{
		
			sbi s = new sbi();
			icici i = new icici();
			axis a = new axis();
			
			System.out.println(s.rate());
			System.out.println(i.rate());
			System.out.println(a.rate());
			
			bank b;
			
			b = new sbi();
			System.out.println(b.rate());
			b = new icici();
			System.out.println(b.rate());
			b = new axis();
			System.out.println(b.rate());
		}
}
