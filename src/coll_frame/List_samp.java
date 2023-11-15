package coll_frame;

import java.util.ArrayList;
import java.util.Scanner;

public class List_samp 
{
	public static void main(String[] args) 
	{
		ArrayList ob=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		for (int i=0; i<4;i++)
		{
			int a=sc.nextInt();
			ob.add(a);
		}
		
		
		
		ob.add(4, 87);
		System.out.println(ob);
		
		System.out.println(ob.contains(87));
		System.out.println(ob.isEmpty());
		System.out.println(ob.size());
		
	}
}
