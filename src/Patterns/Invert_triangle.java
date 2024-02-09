package patterns;

public class Invert_triangle 
{
	public static void main(String[] args)
	{
		int i,j,row=6;
		for(i=(row-1);i>=0;i--)
		{
			for(j=(row-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
