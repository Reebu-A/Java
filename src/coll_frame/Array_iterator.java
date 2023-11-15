package coll_frame;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_iterator 
{
	public static void main(String[] args) 
	{
		
	
	ArrayList ar=new ArrayList();
	ar.add("Hi");
	ar.add(11);
	ar.add(11);
	ar.add("Hi");
	ar.add(7);
	
	Iterator it=ar.iterator();
	//System.out.println(it.next());
	//System.out.println(it.next());
	System.out.println("***********");
	while (it.hasNext())
	{
		System.out.println(it.next());
	}
	
	}
}
