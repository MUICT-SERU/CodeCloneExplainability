import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String ans = "No";

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if ((i*4)+(j*7) == n){
                    ans = "Yes";
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}