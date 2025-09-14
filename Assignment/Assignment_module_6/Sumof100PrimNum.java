package Assignment_module_6;

public class Sumof100PrimNum 
{

	public static void main(String[] args) 
	{
	
		int i, num, count, sum =0;
		for(num=1;num<=100;num++)
		{
			
		count = 0;
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					
					count++;
					break;
				}
			}
			
			if(count==0 && num !=1)
			{
				sum = sum+num;
			}
			
		}
	      System.out.println("The sum of first 100 prime num is"+sum);
	}
}
