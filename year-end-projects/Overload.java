/**
 * Design a class to overload a function series() as follows:
 * i) void series(double n) with one double argument and prints the sum of the series,
 * sum = 1/1 +1/2 +1/3 + ... +1/n
 * ii) double series(double a,double n) with two double arguments and prints the sum of the series.
 * sum=1/a^2+4/a^5+7/a^8+10/a^11....+ to n terms.
 * 
 * 
 *
 */
public class Overload
{
    public void series(double n)//for first type
    {
        double sum = 1.0;//holds the sum
        double term=0.0;
        for (int i = 2; i <= n; i++)
        {
            term=1.0/i;
            sum += term;
        }
        System.out.println(sum);
    }

    public void series(double a, double n) //for second type
    {
        double sum = 0.0;//holds the sum
        for (int i = 0; i < n; i++)
        {
            sum += (i * 3 + 1) / Math.pow(a, (i * 3 + 2));
        }
        System.out.println(sum);
    }
}
