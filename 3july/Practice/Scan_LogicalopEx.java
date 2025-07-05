package July3;

import java.util.Scanner;

public class Scan_LogicalopEx 

{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);

	int a,b,c;
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	
	
	System.out.println(a>b && b>c);
	System.out.println(a>b && b<c);
	System.out.println(a>b || b<c);
	System.out.println(a<b && b<c);
	System.out.println(a>b && b>c);
	System.out.println(a!=b);
}

}

