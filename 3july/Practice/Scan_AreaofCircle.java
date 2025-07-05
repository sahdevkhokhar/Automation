package July3;

import java.util.Scanner;

public class Scan_AreaofCircle
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	float PI=3.14f,ans;
	int r;
	System.out.println("Enter radius of circle : ");
	r= sc.nextInt();
 ans = PI*r*r;
 System.out.println("Area of circle is :" +ans);
 
		 
}
}