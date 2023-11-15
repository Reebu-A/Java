package array;

import java.util.Scanner;

public class Poly 
{
	void area(int x,int y)
	{
		int area=x*y;
		System.out.println("Area of a rectangle "+area);

	}
	void area(int a)
	{
		double r=3.14*a*a;
		System.out.println("Area of a circle = "+r);
	}
	void area()
	{
		Scanner g=new Scanner(System.in);
		System.out.println("Enter the dimension");
		int b=g.nextInt();
		int as=b*b;
		System.out.println("Area of a square "+as);
	}
	
	public static void main(String[] args)
	{
		Scanner q=new Scanner(System.in);
		Poly ob=new Poly();
		System.out.println("1. Area of rectangle");
		System.out.println("2. Area of circle");
		System.out.println("3. Area of square");
		System.out.println("Enter your choice");
		int o=q.nextInt();
		switch (o)
		{
		case 1:
			System.out.println("Enter the dimensions");
			int x=q.nextInt();
			int y=q.nextInt();
			ob.area(x, y);
			break;
		case 2:
			System.out.println("Enter the radius");
			int r=q.nextInt();
			ob.area(r);
			break;
		case 3:
			ob.area();
			break;
			
		}
		
		
	}

}
