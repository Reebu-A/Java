package Arithmetic_operations;

import java.util.Scanner;

public class Large_of3 
{
	public static void main(String[] args) 
	{
		Scanner w=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=w.nextInt();
		System.out.println("Enter the 2nd number");
		int b=w.nextInt();
		System.out.println("Enter the 3nd number");
		int c=w.nextInt();
	
		
		if (a>b && a>c)
		{
				System.out.print("The largest number is ");
				System.out.println(a);
			
		}
		else if(b>c)
			{
				System.out.print("The largest number is ");
				System.out.println(b);
			}
		
		else
		{
			System.out.print("The largest number is ");
			System.out.println(c);
		}
		
		
	}


}
