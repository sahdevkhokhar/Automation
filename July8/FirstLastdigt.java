package July8;

import java.util.Scanner;

public class FirstLastdigt
{
public static void main(String[] args)
{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	int num = sc.nextInt();
    int lastdgt=0,firstdgt=0;
    
    lastdgt = num%10;
    
    while(num>0)
    {
    	if(num>9)
    	{
    		num=num/10;	
    	}
    	
    else
    {
    	
    	firstdgt = num;
    	num = num/10;
    }
    }	
    
    int ans = firstdgt+lastdgt;
    System.out.println(ans);
    
    }
	
}


