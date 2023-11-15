package coll_frame;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset 
{
	public static void main(String[] args) 
	{
		TreeSet tr=new TreeSet();
		tr.add(45);
		tr.add(87);
		tr.add(4);
		tr.add(10);
		tr.add(8);
		tr.add(75);
		tr.add(55);
		tr.add(45);
		System.out.println(tr);
		System.out.println(tr.descendingSet());
		System.out.println("Lowest Value: "+tr.pollFirst());
		System.out.println("Highest Value: "+tr.pollLast());
		System.out.println("Near heighest/Equals "+tr.ceiling(9));
		System.out.println("Near heighest "+tr.higher(10));
		System.out.println("Near Lowest/Equals "+tr.floor(46));
		System.out.println("Near Lowest "+tr.lower(45));
		System.out.println("Head Set: "+tr.headSet(75));
		System.out.println("SubSet: "+tr.subSet(8, 75));
		System.out.println("TailSet: "+tr.tailSet(10));
		System.out.println(tr.contains(45));
		
		 
		//Iterator it=tr.iterator();
		//while (it.hasNext())
		{
		//	System.out.println(it.next());
		}
		
	}

}
