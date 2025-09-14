package Assignment_module_6;

import java.util.Scanner;

public class Sum_and_Average_valueof_Array 
{
public static void main(String[] args) 
{
	//Scanner sc = new Scanner(System.in);
	
	//int num[] = new int[5];
	//int i,sum=0;
	
//	for(i=0;i<num.length;i++)
	//{
		//System.out.println("Enter number"+(i+1)+":");
		//num[i] = sc.nextInt();	
//	}
//	for(i=0;i<num.length;i++);
	//{
		//sum+=num[i];
	//}
	//System.out.println("sum of given number is :"+sum);
	
    int num[] = new int[3];
    int i,sum=0,Avg;
	
	num[0] = 10;
	num[1] = 20;
	num[2] = 30;
    for(i=0;i<num.length;i++)
    {
    	System.out.println(num[i]);
    }
    
    for(i=0;i<num.length;i++)
    {
    	sum+=num[i];
    	
    	
    }
    System.out.println("Sum value of Array elements is :"+sum);
    Avg = sum/i;
    System.out.println("Average value of Array Elements is :"+Avg);
    
}
}