package July8;

import java.util.Scanner;

public class Maxinum
{
	public static void main(String[] args)
	{
		
      Scanner sc= new Scanner(System.in);
     
      System.out.println("Enter any number");
      int maxnum = 0;
      int num = sc.nextInt();
      
      while(num>0)
      {
    	  int rem = num%10;
    	  
    	  if(rem>maxnum)
    	  {
    		  maxnum=rem;    
    	  }
    	  
    	  num=num/10;
      } 
    	  System.out.println("Maximum number is :" +maxnum );
  
      }
	
}

	


