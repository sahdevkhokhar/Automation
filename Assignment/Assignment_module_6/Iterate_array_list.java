package Assignment_module_6;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_array_list 
{
        public static void main(String[] args) 
        {
		
        	ArrayList<String> list = new ArrayList<>();
        	list.add("Apple");
        	list.add("Banan");
        	list.add("Orange");
        	list.add("Mango");
        	
        	
        	ArrayList list2 = new ArrayList<>();
        	list.add("Blue");
        	list.add("Red");
        	list.add("Pink");
        	       	
        	Iterator i = list.iterator();
        	
        	while(i.hasNext())
        	{
        		System.out.println(i.next());
        	}
        	
		}
}
