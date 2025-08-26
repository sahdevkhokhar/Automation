package Collection_framwork_Arraylist_Hasmap_Hashseet_linkesSheet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2Ex 
{

	public static void main(String[] args) 
	{
		
		HashSet set = new HashSet<>();
		
		set.add("sahdev");
		set.add("manthan");
		set.add("darshan");
		set.add("vishal");
		set.add("sahdev");
		
		System.out.println(set);
		
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
