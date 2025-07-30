package July21Inheritance;

      class Bank
      {
    	  void bank()
    	  {
    		  System.out.println("Banking");
    	  }  
      }
      
      class Current extends Bank
      {
    	  void current()
    	  {
    		  System.out.println("Current");
    	  }	  
      }
      
      class saving extends Bank
      {
    	  void saving()
    	  {
    		  System.out.println("Saving");
    	  } 
      }
      
   public class HierarchicalInhEx 
   {
    public static void main(String[] args) 
    {
	
    	     Current c = new Current();
    	     saving s = new saving();
    	     
    	     
    	     c.current();
    	     s.saving();
    	     c.bank();
    	     
	}
   }
