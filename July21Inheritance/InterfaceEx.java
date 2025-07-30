package July21Inheritance;


    interface Print
     {
    	 void p();

		 
     }
     
     interface print2
     {
    	 void p2();	 
     }
     
    public class InterfaceEx implements Print,print2
    
    
     {

		@Override
		public void p() 
		{
		System.out.println("P Called");	
			
		}

		
		@Override
		public void p2() 
		{
		System.out.println("P2 Called");	
			
		}

		public static void main(String[] args)
		{
		
			InterfaceEx i1 = new InterfaceEx();
			
			i1.p();
			i1.p2();
		}
     }
