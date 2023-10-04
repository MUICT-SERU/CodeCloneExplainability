import java.util.Scanner;

public class Main{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < a.length;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = n-1;i >= 0;i--){
            System.out.print(a[i]);

            if(i != 0){
                System.out.print(" ");
            }
        }

        System.out.print("\n");
    
        sc.close();
   }
}
