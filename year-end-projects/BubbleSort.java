import java.util.Scanner;

/**
 * Write a program to input 10 integer elements in an array and sort them in
 * descending order using the bubble sort technique.
 */
public class BubbleSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the elements:");
		int num[] = new int[10];//initialize array
		for (int i = 0; i < 10; i++)
		{
			System.out.print((i + 1) + ")");
			num[i] = sc.nextInt();
		}
		bubbleSort(num);
		System.out.println("Array has been sorted.");
		System.out.println("Sorted Array:");
		
		for (int i = 0; i < 10; i++)//display the sorted array
		{
			System.out.print((i + 1) + ")");
			System.out.println(num[i]);
		}
	}

	public static void bubbleSort(int[] in)
	{
		int temp;//for swapping purposes
		for (int i = 0; i < in.length; i++)
		{
			for (int j = 0; j < in.length - i - 1; j++)
			{
				if (in[j] < in[j + 1])
				{
					//swap
				    temp = in[j];
					in[j] = in[j + 1];
					in[j + 1] = temp;
				}
			}
		}
	}
}