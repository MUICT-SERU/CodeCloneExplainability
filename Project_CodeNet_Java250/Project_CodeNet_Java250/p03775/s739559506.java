import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int n_sqrt = (int)(Math.sqrt(n));
        for (int i = n_sqrt; i > 0; i--){
            if (n % i == 0){
                System.out.println((int)(Math.log10(n / i) + 1));
                break;
            }
        }
        
    }
}
