package abstra;

import java.util.Scanner;

public class Banking_main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Banking_v q=new Banking_v();
		System.out.println("Welcome");
		System.out.println("Please enter the customer details");
	    q.setN(null);
	    q.setAc(null);
	    q.setMob(null);
	    int bal=q.getBa();
	    int d=0;
		do 
		{
		System.out.println("Enter your Choice");
		System.out.println("1.Customer Details");
		System.out.println("2.Deposit");
		System.out.println("3.Witdrawal");
		System.out.println("4.Balance");
		System.out.println("5.Exit");
	    d=sc.nextInt();
	    
	    switch (d)
		{
		case 1:
			System.out.println(q.getN());
			System.out.println(q.getAc());
			System.out.println(q.getMob());
			System.out.println(q.getBa());
			System.out.println("          ");
			q.star();
			break;
		case 2:
			System.out.println("Enter the amount to deposit");
			int g=sc.nextInt();
			bal=bal+g;
			System.out.println("Balance= "+bal);
			System.out.println("          ");
			q.star();
			break;
		case 3:
			System.out.println("Enter the amount for withdrawal");
			int w=sc.nextInt();
			if (bal-w<1000)
			{
				System.out.println("insufficient balance");
			}
			else
			{
				bal=bal-w;
				System.out.println("Balance= "+bal);
			}
			System.out.println("          ");
			q.star();
			break;
		case 4:
			System.out.println("Balance= "+bal);
			q.star();
			break;
		case 5:
			System.out.println("          ");
			System.out.println("Thank you for banking with us");
			break;
		default:
			System.out.println("Out of option");
			
		}
		}while (d<5);
		
		
	}
	


}


