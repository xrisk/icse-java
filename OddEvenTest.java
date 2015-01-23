import java.util.Scanner;

/**
 * Write a program to input some numbers.
 * Print the sum of the negative numbers,
 * the sum of the even numbers,
 * and the sum of the odd numbers.
 */
public class OddEvenTest
{
	public static void main(String arg[])
	{
		System.out.println("Enter some numbers:");
		System.out.println("Enter 0 to terminate:");
		Scanner sc = new Scanner(System.in);
		int num = 0;//holds the number
		int sumNegative = 0, sumEven = 0, sumOdd = 0;
		num = sc.nextInt();
		sc.nextLine();
		while (num != 0)
		{
			
			if (num < 0)
				sumNegative += num;
			else if (num % 2 == 0)
				sumEven += num;
			else
				sumOdd += num;
			num=sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Sum of negative numbers:"+sumNegative);
		System.out.println("Sum of even numbers:"+sumEven);
		System.out.println("Sum of odd numbers:"+sumOdd);
	}
}
