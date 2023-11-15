package Arithmetic_operations;

import java.util.Scanner;

public class Amstrong_number 
{
	public static void main(String[] args) 
	{
		
		Scanner q=new Scanner (System.in);
		System.out.println("Enter the number");
		int a=q.nextInt();
		int i=a;
		int s=0;
		int sum=0;
		
		while (a>0)
		{
			s=a%10;
			sum=sum+(s*s*s);
			a=a/10;
			
		}
		
		if (i==sum)
		{
		System.out.println("Number is amstrong");
		System.out.println(sum);
		}
		else
		{
			System.out.println("Number is not amstrong");
		}
	}

}
