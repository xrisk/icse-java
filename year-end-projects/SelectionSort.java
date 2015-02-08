import java.util.Scanner;

/**
 * Write a program to allow the user to enter numbers.
 * Sort these numbers using Selection sort.
 */
public class SelectionSort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How mnay numbers do you have?");
		int l=sc.nextInt();
		sc.nextLine();
		int num[]=new int[l];
		//accept the numbers
		System.out.println("Please enter the numbers");
		for (int i=0;i<l;i++)
		{
			System.out.print((i+1)+")");
			num[i]=sc.nextInt();
			
		}
		System.out.println("-----------------");
		//sort the array
		selectionSort(num);
		System.out.println("Sorted Array:");
		for (int i=0;i<l;i++)
		{
			//display the sorted array
		    System.out.println(num[i]);
		}
		
		
		
	}
	
	public static void selectionSort(int arr[])
	{
		int temp=0;//for swapping
		int min=0;//to hold the smallest number
		for (int i=0;i<arr.length;i++)
		{
			min=i;
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
				
		}
		
	}
}
