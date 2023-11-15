package array;

import java.util.Scanner;

public class Checking_number 
{
	public static void main(String[] args) 
	{
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int a=q.nextInt();
		int ar[]=new int[a];
		int sr[]=new int[a];
		System.out.println("Enter the values");
		
		for (int i=1;i<a;i++)
		{
			ar[i]=q.nextInt();
		}
		
		System.out.println("Enter the number for checking");
		int b=q.nextInt();
		int s=0;
		
		for (int i=1;i<a;i++)
		{
			if (ar[i]==b)
			{
				s=s+1;	
				sr[i]=i;
				
			} 
						
		
		}
			if ( s>0)
			{
				System.out.println("The searched number "+b+" found "+s+" times in the array ");
				System.out.println("In the locations");
				for (int k=1;k<a;k++)
				{
					if(sr[k]!=0) 
					{
					System.out.println(k);
					}
				}
			}		
		
			else
			{
				System.out.println("The number is not in the array");
			}
	}

}
