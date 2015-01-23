/**
 * Write a program to sort a list of names.
 */
public class NameSort
{
	public static void main(String[] args)
	{
		//array of names
	    String names[]={"Rahul","Rishav","Ajay","Suhail","Maneesh","Devesh","Sohum","Yash"};
		System.out.println("Original Array Was:");
		System.out.println();
		for (int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		String temp="";
		//bubble sort algorithm
		for (int i = 0; i < names.length; i++)
		{
			for (int j = 0; j < names.length - i - 1; j++)
			{
				if (names[j].compareTo( names[j + 1])>0)
				{
					temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}
		System.out.println("-------------------");
		System.out.println("After Sorting:");
		//print the names after sorting
		for (int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
	}
}
