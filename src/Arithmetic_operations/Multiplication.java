package Arithmetic_operations;

import java.util.Scanner;

public class Multiplication 
{
	public static void main(String[] args) 
	{
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=q.nextInt();
		System.out.println("Enter the limit");
		int b=q.nextInt();
		int mul=1;
		int r=0;
		
		while (mul<b+1)
		{
			r=a*mul;
			
			
			System.out.println(mul+" * "+a+"= "+r);
			
			mul++;
		}
		
		
	}

}
