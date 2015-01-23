import java.util.Scanner;

/**
 * Write a program to input a ISBN code and check its validity.
 * It is valid if:
 * i)it has ten digits.
 * ii) first digit * 1 + second digit *2 +third digit *3 ... is divisible by 11
 */
public class ISBN
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a ISBN Code");//accept ISBN
		int isbn=sc.nextInt();
		int[] digits=getDigits(isbn);//get the digits as an array
		if (digits.length!=10)//check length
			System.out.println("Illegal ISBN. Invalid number of digits.");
		else
		{
			int sum=0;
			for (int i=0;i<10;i++)
			{
				sum+=digits[i]*(i+1);
			}
			if (sum%11!=0)//check divisibility
				System.out.println("Illegal ISBN");
			else System.out.println("Legal ISBN");
		}
		
	}
	
	public static int[] getDigits(int number)
	{
		int[] digits=new int[(int) Math.floor(Math.log10(number))+1];//gives number of digits
		int c=digits.length-1;
		while (number>0)
		{
			digits[c]=number%10;//store each digit
			number/=10;
			c--;
		}
		return digits;
	}
}
