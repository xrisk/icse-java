/**
 * Write a menu-driven program to 
 * i) check for a composite number.
 * ii) find the smallest digit in a number.
 */
import java.util.Scanner;

public class Menu
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu Driven Program");
		System.out.println("-------------------");
		System.out.println("1. Composite Number Check");
		System.out.println("2. Smallest Number Check");
		System.out.print("Enter your choice:");
		//get the choice
		int ch = sc.nextInt();
		{
			switch (ch)
			{
				case 1:
					boolean composite = false;
					System.out.print("Enter a number:");
					int num = sc.nextInt();
					for (int i = 2; i < num - 1; i++)
					{
						if (num % i == 0)//if number is divisible then not prime
						{
							composite = true;
							break;
						}
					}
					if (composite)
						System.out.println("It is a composite number.");
					else
						System.out.println("It is not a composite number.");
					break;
				case 2:
					int min = 10;//even the largest number of a number cannot be 10
					System.out.print("Enter a number:");
					num = sc.nextInt();
					while (num > 0)
					{
						min = (num % 10 < min) ? (num % 10) : min;//check if this digit is smaller than min
						num /= 10;
					}
					System.out.println("The smallest number is " + min);
					break;
			}
		}
	}
}
