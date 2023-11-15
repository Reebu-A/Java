package Arithmetic_operations;

import java.util.Scanner;

public class Voting_Age 
{
	public static void main(String[] args)
	{
		Scanner q=new Scanner(System.in);
		System.out.println("Enter your age");
		int a=q.nextInt();
		if (a>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
	}

}
