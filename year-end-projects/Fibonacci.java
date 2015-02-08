import java.util.Scanner;

/**
 * Write a program to output the first N Fibonacci numbers.
 */
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many terms do you want?");
		//ask the user about N
		int terms = sc.nextInt();
		int term1 = 0;//the first term is always 0
		int term2 = 1;//the second term is always 1
		for (int i = 2; i <= terms; i++)
		{
			System.out.print(term1 + " " + term2+" ");//print the terms
			term1+=term2;//compute the next term
			term2+=term1;//compute the next term
		}
	}
}
