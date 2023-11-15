package coll_frame;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_SwC 
{
	public static void main(String[] args) 
	{
		Arraylist_SwC stw=new Arraylist_SwC();
		ArrayList ob=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		for (int i=0; i<4;i++)
		{
			int a=sc.nextInt();
			ob.add(a);
		}
		int q=0;
		do {
		System.out.println("Enter your choice");
		System.out.println("1. For print the values");
		System.out.println("2. to find the size");
		System.out.println("3. to check the array is empty");
		System.out.println("4. to check the array contains a value");
		System.out.println("5. to get a value from the array");
		System.out.println("6. to remove an element from the array");
		System.out.println("7. to clear the list");
		System.out.println("8. To exit");
		q=sc.nextInt();
		
		switch (q)
		{
		case 1:
			System.out.println("The entered values are: ");
			System.out.println(ob);
			stw.star();
			break;
		case 2:
			System.out.println("Size of the array is: "+ob.size());
			stw.star();
			break;
		case 3:
			System.out.println("Is the array empty: "+ob.isEmpty());
			stw.star();
			break;
		case 4:
			System.out.println("Enter the value to check");
			int r=sc.nextInt();
			System.out.println("the status of value in the array is: "+ob.contains(r));
			stw.star();
			break;
		case 5:
			System.out.println("Enter the index number for getting the value");
			int w=sc.nextInt();
			System.out.println("The value is: "+ob.get(w));
			stw.star();
			break;
		case 6:	
			System.out.println("Enter the index number for removing the value");
			int e=sc.nextInt();
			System.out.println("The value is: "+ob.remove(e));
			System.out.println(ob);
			stw.star();
			break;
		case 7:
			System.out.println("The list is now cleared");
			stw.star();
			ob.clear();
			break;
		default:
			System.out.println("Thank you");
		}
		
		}while(q<8);
		
		
		
		
		
	}
	
void star()
{
	System.out.println("                              ");
	System.out.println("******************************");
	
	
}	

}
