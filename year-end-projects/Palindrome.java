/**
 * Write a program to enter a String
 * and check if it is a palindrome or not.
 */
import java.util.Scanner;

public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter a String:");
		String str=sc.nextLine();//input the String
		String rev="";
		for (int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);//reverse the String
		}
		System.out.println("Reversed String:"+rev);
		if (str.equals(rev))//if the reversed String is the same as original
			System.out.println("It is a palindrome.");
		else
			System.out.println("It is not a palindrome.");
	}
}
