package Collection_framwork_Arraylist_Hasmap_Hashseet_linkesSheet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LikedhashsetEx 
{
     public static void main(String[] args) 
     {
	
    	 LinkedHashSet set = new LinkedHashSet<>();
    	 
    	 
    	 set.add("sahdev");
    	 set.add("manthan");
    	 set.add("darshan");
    	 set.add("vishal");
    	 set.add("vipul");
    	


    	 
    	 //System.out.println(set);
    	 
    	 Iterator i = set.iterator();
    	 
    	 while(i.hasNext())
    	 {
    		 System.out.println(i.next());
    	 }
	}
	
}
