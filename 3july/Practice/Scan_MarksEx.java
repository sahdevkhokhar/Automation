package July3;

import java.util.Scanner;

public class Scan_MarksEx
{
public static void main(String[] args)
{
	
Scanner sc = new Scanner(System.in);

	int maths,eng,hindi,guj;
	System.out.println("Enter Maths Marks ");
	maths = sc.nextInt();
	System.out.println("Enter eng Marks ");
	eng = sc.nextInt();
	System.out.println("Enter hindi Marks ");
	hindi = sc.nextInt();
	System.out.println("Enter guj Marks ");
	guj = sc.nextInt();

	int total;
	float per;
	

	total = maths+guj+hindi+eng;
	per = total/4;
	
	System.out.println("My total Percentage is : "+per);

	}
		
}
