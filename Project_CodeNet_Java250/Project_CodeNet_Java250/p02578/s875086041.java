import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        long ans = 0;

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i<n; i++){
            if (arr[i] < arr[i-1]){
                ans += (arr[i-1]-arr[i]);
                arr[i] = arr[i-1];
            }
        }
        System.out.println(ans);
    }
}