import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(i != n-1){
                System.out.print(a[i] + " ");
            }else{
                System.out.println(a[i]);
            }
        }
        int v, j;
        for(int i = 1; i < n; i++){
            v = a[i];
            j = i-1;
            while(j >= 0 && a[j] > v){
                a[j+1] = a[j];
                j--;
                a[j+1] = v;
            }
            for(int k = 0; k < n; k++){
                if(k != n-1){
                System.out.print(a[k] + " ");
                }else{
                    System.out.println(a[k]);
                }
            }
        }
    }
}

