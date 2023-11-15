package coll_frame;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkedhash 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l=new LinkedHashSet();
		l.add(14);
		l.add(14);
		l.add("Hi");
		l.add("H");
		l.add("Hi");
		System.out.println(l);
		
		Iterator it=l.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
