import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        int i=0;

        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(i=(n-1);i>=0;i--){
            System.out.printf("%d",a[i]);
            if(i != 0){
            System.out.printf(" ");
            }else{
                System.out.println(); 
            
            }
        }
    }
}
