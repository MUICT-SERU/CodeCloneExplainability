import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        sc.close();
        int ans;
        if(k%2==0) ans=k/2;
        else ans=k/2+1;
        System.out.println(ans);
    }
}