package Collection_framwork_Arraylist_Hasmap_Hashseet_linkesSheet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx 
{

	public static void main(String[] args) 
	{
	
		HashSet set = new HashSet<>();
		
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(1);
		set.add(4);
		
		System.out.println(set);
		
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
