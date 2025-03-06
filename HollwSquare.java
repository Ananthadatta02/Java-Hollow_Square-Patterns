package star_patterns;

import java.util.Scanner;

/*
* * * * 
*     * 
*     * 
* * * * 
 */
public class HollwSquare 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = s.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(size%2==0)
				{
					if(i==1 || i==size || j==1 || j==size)
					{
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
