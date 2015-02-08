import java.util.Scanner;

/**
 * Write a program to accept a word and convert it to Pig Latin.
 * The PigLatin of a word can be found by:
 * i) finding the first vowel
 * ii) taking the rest of the word from the vowel onwards
 * iii) adding the truncated part of the word
 * iv) adding 'ay' at the end.
 */

public class PigLatin
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String input = sc.nextLine();//input the word
		char ch;
		int indexOfFirstVowel = -1;//stores the position of the first vowel
		for (int i = 0; i < input.length(); i++)
		{
			ch = Character.toUpperCase(input.charAt(i));//for convenience 
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') //check if the letter is a vowel
			{
				indexOfFirstVowel = i; //if so, store the position
				break;
			}
		}
		if (indexOfFirstVowel != -1)//check if a vowel exists
		{
			String pig = input.substring(indexOfFirstVowel, input.length())
					+ input.substring(0, indexOfFirstVowel) + "ay";
			System.out.println(pig);
		}
		else
			System.out.println("Vowel not Found! PigLatin could not be created.");
	}
}