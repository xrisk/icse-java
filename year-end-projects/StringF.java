import java.util.Scanner;

/**
 * Write a program to input a String,
 * and convert to uppercase, lowercase and togglecase.
 */
public class StringF
{
	public static void main(String args[])
	{
		System.out.print("Input a String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Length of String:"+str.length());
		System.out.println("UPPER CASE:"+str.toUpperCase());//uppercase
		System.out.println("lower case:"+str.toLowerCase());//lowercase
		String n="";
		for (int i=0;i<str.length();i++)
		{
			if (Character.isUpperCase(str.charAt(i)))//if already upper
			{
				n=n+Character.toLowerCase(str.charAt(i));//convert to lower
			}
			else if (Character.isLowerCase(str.charAt(i)))//if already lower
			{
				n=n+Character.toUpperCase(str.charAt(i));//convert to upper
			}
			else
				n=n+str.charAt(i);//if not a letter, do nothing
		}
		System.out.println("Toggle Case:"+n);
	}
}
