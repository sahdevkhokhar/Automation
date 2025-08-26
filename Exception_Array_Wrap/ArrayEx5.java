package Exception_Array_Wrap;

import java.util.Scanner;

public class ArrayEx5 
{
public static void main(String[] args) 
{

	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many subject you want");
	num = sc.nextInt();
	
	int marks[]= new int[num];
	int i;int total=0;
	float per;
	
	for(i=0;i<marks.length;i++)
	{
		System.out.println("Enter marks for subject"+(i+1)+":");
		marks[i] = sc.nextInt();
	}
	for(i=0;i<marks.length;i++)
	{
		total+=marks[i];
	}
	
	System.out.println("total is:"+total);
	per = total/marks.length;
	System.out.println("Percentage is:"+per);
}
}
