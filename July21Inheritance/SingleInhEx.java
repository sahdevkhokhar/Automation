package July21Inheritance;


     class A
     {
             void a()
            {
	             System.out.println("A Called");
            }
     }
       
      class B extends A
      {
    	  
    	      void b()
    	     {
    		  
    		  System.out.println("B Called");
    	      }
      }
      
     
       public class SingleInhEx 
       {
           public static void main(String[] args)
           {
        	   B b = new B();
        	   
        	   b.a();
        	   b.b();
        	   
           }
            
        	   
		   }
	

