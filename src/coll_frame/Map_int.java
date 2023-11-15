package coll_frame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_int 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String>h=new HashMap();
		h.put(1, "hai");
		h.put(2, "w");
		h.put(3, "h");
		h.put(4, "i");
		
		//Set s=h.entrySet();
		//Iterator it=s.iterator();
		
		for(Map.Entry r:h.entrySet())
		{
			System.out.println(r.getKey()+" : "+r.getValue());
		}
	}

}
