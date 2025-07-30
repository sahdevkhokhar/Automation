package Pattern;

public class Pract3
{

	public static void main(String[] args)
	{
	
		int row,colm,num=6;
		
		for(row=1;row<=6;row++)
		{
			for(colm=1;colm<=6-row;colm++)
			{
				
				System.out.print("*");
			}
	            System.out.println();
		}
	}
}
