import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        int r=1;
        boolean aaaa=false;

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        while(true){
            r=a[r-1];
            count++;
            if(r==2){
                aaaa=true;
                break;
            }
            if(count>n){
                break;
            }
        }

        if(aaaa){
            System.out.println(count);
        }else{
            System.out.println("-1");
        }


    }



}