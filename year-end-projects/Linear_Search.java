/**
 * Write a program to store city names and their STD codes in two
 * Single Dimensional Arrays. Allow the user to search for a city.
 * Use the linear search technique.
 */
import java.util.Scanner;

public class Linear_Search
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many cities have you?");
		//inpu the number of cities
		int l=sc.nextInt();
		sc.nextLine();
		String cities[]=new String[l];
		String stdCodes[]=new String[l];
		System.out.println("Please input the city names:");
		for (int i = 0; i < l; i++)
		{
			System.out.print((i + 1) + ")");
			cities[i] = sc.nextLine();//store it in an array
		}
		System.out.println("Please input the STD codes.");
		for (int i = 0; i < l; i++)
		{
			System.out.print(cities[i]+":");
			stdCodes[i] = sc.nextLine();//store it in an array
		}
		System.out.println("Enter the city to search for:");
		System.out.println("Enter XX to terminate program.");
		String input=sc.nextLine();
		while (!input.equalsIgnoreCase("XX"))//check for termination
		{
			int i=0;
			for (i=0;i<l;i++)//linear search
			{
				if (cities[i].equalsIgnoreCase(input))
				{
					System.out.println("The STD code is "+stdCodes[i]);
					break;
				}
			}
			if (i==l)
				System.out.println("Not Found");
			input=sc.nextLine();
		}
	}
}
