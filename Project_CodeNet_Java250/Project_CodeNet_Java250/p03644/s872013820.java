import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException 
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int maxCount = 0;
        int highest = 0;
        for (int i = 1; i <= n; i++)
        {
            int copy = i;
            int count = 0;
            while (copy % 2 == 0)
            {
                count++;
                copy /= 2;
            }
            if (count >= maxCount)
            {
                maxCount = count;
                highest = i;
            }
        }
        System.out.println(highest);
    } 
}