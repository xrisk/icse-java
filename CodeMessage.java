import java.util.Scanner;

/**
 * Write a program that codes a String by adding 10 to the ASCII value
 * of each character. Also provide the functionality to decode a message.
 */
public class CodeMessage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Create Code");
        System.out.println("2. De Code");
        System.out.print("Enter your choice");//accept the choice
        int ch=sc.nextInt();
        sc.nextLine();
        String code="";
        switch (ch)
        {
            case 1:
            System.out.print("Enter a String:");
            String tmp=sc.nextLine();
            for (int i=0;i<tmp.length();i++)
            {
                code+=(char)(tmp.charAt(i)+10);//add 10 to the ASCII
            }
            System.out.println("Code Message:"+code);//print the code
            break;
            case 2:
            System.out.print("Enter a String:");
            tmp=sc.nextLine();
            for (int i=0;i<tmp.length();i++)
            {
                code+=(char)(tmp.charAt(i)-10);//subtract 10 from the ASCII
            }
            System.out.println("Decoded Message:"+code);
            break;
        }

    }

}
