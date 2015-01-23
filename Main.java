import java.io.*;
import java.util.InputMismatchException;
import java.util.Stack;

public class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0)
        {
            String temp[] = br.readLine().split(" ");
            int num = Integer.parseInt(temp[0]);
            int holy[] = new int[num + 1];
            for (int i = 1; i <= num; i++)
            {
                holy[i] = Integer.parseInt(temp[i]);
            }
            int ans = hcf(holy[1], holy[2]);
            for (int i = 2; i <= num; i++)
            {
                ans = hcf(ans, holy[i]);
            }
            for (int x : holy)
            {
                pw.print(x % ans);
            }
            pw.println();
            pw.flush();
        }
    }

    static int hcf(int a, int b)
    {
        if (a < b)
        {
            if (a == 0)
                return b;
            return hcf(b % a, a);
        }
        else
            return hcf(b, a);
    }
}
