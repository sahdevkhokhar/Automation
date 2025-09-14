package Assignment_module_6;

public class Copy_one_Arrayto_Another 
{
   public static void main(String[] args) 
   {
	int Arr1[] = new int[] {10,20,30,40};
	int Arr2[] = new int[Arr1.length];
	
	for(int i=0;i<Arr1.length;i++)
	{
		Arr2[i] = Arr1[i];
	}
	System.out.println("Display elements of secound Array");
	
	for(int i=0;i<Arr2.length;i++)
	{
		System.out.println(Arr2[i]+" ");
	}
}
}
