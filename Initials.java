/**
 * Write a program to input a person's name,
 * and print out his initials.
 */
import java.util.Scanner;

public class Initials
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your full name:");
		String name=sc.nextLine();//input name
		String initials=Character.toUpperCase(name.charAt(0))+".";
		for (int i=1;i<name.length();i++)
		{
			if (name.charAt(i)==' ')//if this character is a space
			{
			    //take the next character
				initials+=(Character.toUpperCase(name.charAt(i+1))+".");
			}
		}
		System.out.println("Your initials are:\t"+initials);
		//print out the initials
	}
}
