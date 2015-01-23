/**
 * Write a program to output the factors of a number.
 */
import java.util.Scanner;

public class Factors
{
	public static void main(String main[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();//accept the number
		for (int i=1;i<=num;i++)
		{
			if (num%i==0)//if num is divisble by i...
				System.out.println(i+ " is a factor.");//i is a factor
		}
	}
}
