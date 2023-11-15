package Arithmetic_operations;

import java.util.Scanner;

public class Number_interchange 
{
	public static void main(String[] args)
	{
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int A=q.nextInt();
		System.out.println("Enter the value of B:");
		int B=q.nextInt();
		
	    A=A+B;
	    B=A-B;
	    A=A-B;
	   
		System.out.println("The interchanged value of A is: "+A);
	
	
		System.out.println("The interchanged value of B is: "+B);
		
		
	}	

}
