package Assignment_module_6;

public class MaxMin_Value_of_Array 
{

	public static void main(String[] args) 
	{
	
		int[]num= {10,20,30,40,50};
		int i,max=0,min=0;
		
		
		for(i=1;i<num.length;i++)
		{
			if(max<num[i])
			{
			max=num[i];
			}
			
			if(min>num[i])
			{
				min=num[i];
			}
		}
		System.out.println("Maximum value is :"+max);
		System.out.println("Minumum value is :"+min);
	}
}
