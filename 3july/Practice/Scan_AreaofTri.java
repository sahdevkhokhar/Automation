package July3;

import java.util.Scanner;

public class Scan_AreaofTri 
{
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   
	float value = 0.5f, ans;
	int a,b;
	System.out.println("Enter value of a");
	a = sc.nextInt();
	System.out.println("Enter value of b");
     b = sc.nextInt();
	ans = value*a*b;
	System.out.println("Area of Tringle is : "+ans);
}
}
