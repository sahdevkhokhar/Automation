package Exception_Array_Wrap;

import java.io.IOException;




	class M
	{
		void m() throws IOException
		{
			System.out.println("M Called");
		}
	}
		class N extends M
		{
			void n() throws IOException
			{
				System.out.println("N Called");
			}
		}
		
		class P extends N
		{
			void p() throws IOException
			{
				System.out.println("P Called");
			}
	
		}
		
		public class ThrowsEx2
		{
			public static void main(String[] args) throws IOException
	
			{
				
				P p1 = new P();
				p1.p();
				p1.m();
				p1.n();
			
		
			}
		}


