/**
 * Write a program to print the following pattern.
 * 
 * 1        1
 * 12      21
 * 123    321
 * 1234  4321
 * 1234554321
 */

public class Pattern
{
	public static void main(String args[])
	{
		int lines=5;//number of lines
		int spaces=lines*2-2;//calculate number of spaces in first line
		for (int i=1;i<=lines;i++)//for each line...
		{
			for (int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for (int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			spaces-=2;
			System.out.println();
		}
	}
}
