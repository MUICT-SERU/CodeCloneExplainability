import java.util.*;
import java.math.*;

class Main{
    public static void cout(String str)
    {
        System.out.println(str);
    };
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        String a="",b="",str;
        int n;
        n=cin.nextInt();
        cin.nextLine();
        str=cin.nextLine();
        for(int i=0;i<n/2;i++)
        {
            a=a+str.charAt(i);
        }
        if(str.equals(a+a))
            cout("Yes");
        else cout("No");
    }
};
