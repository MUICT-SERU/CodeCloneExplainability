import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = scan.nextInt();
        int count = 0;
        if(x%50!=0)
        {
            System.out.println(0);
            return;
        }
        
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=b;j++)
            {
                for(int k=0;k<=c;k++)
                {
                    if(500*i+100*j+50*k==x)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}