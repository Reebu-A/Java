package Arithmetic_operations;

import java.util.Scanner;

public class Add_of_numbers 
{
	public static void main(String[] args)
	{
	
		Scanner w=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=w.nextInt();
		int l=0;
		int sum=0;
		while (a>0)
		{
		
		    l=a%10;
			a=a/10;
			sum=l+sum;
			
		}
		
		System.out.println("Sum of the number is ");
		System.out.println(sum);
		
		
	}
	
}
