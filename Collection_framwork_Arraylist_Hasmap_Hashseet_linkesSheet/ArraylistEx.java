package Collection_framwork_Arraylist_Hasmap_Hashseet_linkesSheet;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx 
{
        public static void main(String[] args) 
        {
		
        	ArrayList<String> list = new ArrayList<>();
        	list.add("android");
        	list.add("java");
        	list.add("ios");
        	list.add("php");
        	
        	
        	ArrayList list2 = new ArrayList<>();
        	list.add("WD");
        	list.add("GD");
        	list.add("UI/UX");
        	
        	//  list.addAll(list2);
            //  list.remove(2);	
            //  list.remove("php");
        	    list.removeAll(list2);
        	    
        	    System.out.println(list);
        	
        	Iterator i = list.iterator();
        	
        	while(i.hasNext())
        	{
        		System.out.println(i.next());
        	}
        	
		}
}
