import java.util.Scanner;
public class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int k=sc.nextInt();
        int s=sc.nextInt();
        int ans=0;
        for(int x=0;x<=k;x++){
            for(int y=0;y<=Math.min(k,s-x);y++){
                int z=s-x-y;
                if(z>=0&&z<=k) ans++;
            }
        }
        System.out.println(ans);
    }
}