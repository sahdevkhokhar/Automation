package July8;

import java.util.Scanner;

public class TableEx_For
{
public static void main(String[] args)
{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	int num = sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(num+ "*" +i+ "=" +num*i);
	}
	
	
	
	
}

}
