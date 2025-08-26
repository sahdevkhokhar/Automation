package Collection_framwork_Arraylist_Hasmap_Hashseet_linkesSheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx 
{
   public static void main(String[] args) 
   {
	
	   HashMap<String,Integer> map = new HashMap<>();
	    
	   map.put("a",1);
	   map.put("b",2);
	   map.put("c",3);
	   map.put("d",4);
	   
	   for(Map.Entry m : map.entrySet())
	   {
		   
		   System.out.println(m.getKey()+""+m.getValue());
	   }
}
}
