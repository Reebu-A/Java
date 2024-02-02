package returnfn;

import java.util.Scanner;

public class calc implements Arith
{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	

	 void input_data()
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println(add(a,a));
	}
}
