/**
 * Write a program to calculate the value of:
 *      (x^2+5^2)/(x+5)
 *      for x=1 to 50
 */

public class MathF
{
    public static void main(String args[])
    {
        for (int i=1;i<=50;i++)
        {
            //print the result of the computation
            System.out.println("x="+i+" , Z="+compute(i) );
        }
    }
    public static double compute(int x)
    {
        //calculate the value of the function
        return (Math.pow(x, 2)+Math.pow(5, 2))/(x+5);
    }
}
