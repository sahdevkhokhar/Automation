package Assignment_module_6;

public class Secound_largestnum_Array 
{

	public static void main(String[] args) 
	{
	
		int num[]= {10,20,25,35,40,50};
		int temp;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
		}
		
		System.out.println("Secound largest number is "+num[1]);
	}
}
