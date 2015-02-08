import java.util.Scanner;

/**
 * Write a program to allow the user to enter numbers.
 * Then search for a particular number using Binary Search.
 */

public class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers do you have? ");
		int l=sc.nextInt();
		int num[]=new int[l];
		System.out.println("Please input the numbers:");
		for (int i=0;i<l;i++)//input the numbers
		{
			System.out.print((i+1)+")");
			num[i]=sc.nextInt();
		}
		System.out.println("-----------");
		//sort the array
		selectionSort(num);
		System.out.println("Sorted Array:");
		System.out.print("Enter the number to search for:");
		//get the query number
		int query=sc.nextInt();
		int low=0;
		int high=l-1;
		int mid=(low+high)/2;
		//binary search
		while (high>low)
		{
			if (query==num[mid])
			{
				System.out.println("Found");
				break;
			}
			else if (query<num[mid])
			
				high=mid-1;
			else
				low=mid+1;
			mid=(low+high)/2;
		}
		if (high<low)
		{
			System.out.println("Not Found");
		}
	}
	public static void selectionSort(int arr[])
	{
		int temp=0;//for swapping
		int min=0;//to store the smallest number
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
