import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int d=sc.nextInt();
        int n=sc.nextInt();
        if(n==100)n++;
        long ans=(long)Math.pow(100,d)*n;
        System.out.println(ans);
    }
}