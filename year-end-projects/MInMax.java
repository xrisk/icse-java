import java.util.Scanner;
/**
 * Write a program to input some numbers,
 * and print the largest and the smallest among them.
 */
public class MInMax
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers do you have?");
		int n=sc.nextInt();//get the number of numbers
		sc.nextLine();
		int min=Integer.MAX_VALUE;//holds the smallest value
		int max=Integer.MIN_VALUE;//holds the largest value
		int temp=0;
		for (int i=0;i<n;i++)
		{
			temp=sc.nextInt();
			sc.nextLine();
			if (temp<min)
				min=temp;
			if (temp>max)
				max=temp;
		}
		System.out.println("Max:"+max);//print the maximum
		System.out.println("Min:"+min);//print the minimum
	}
}
