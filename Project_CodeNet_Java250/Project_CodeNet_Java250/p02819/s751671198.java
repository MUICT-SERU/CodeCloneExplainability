import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(!isPrime(x))x++;
        System.out.println(x);
    }
    static boolean isPrime(int x) {
        if(x <= 1) return false;
        for(int i = 2; i * i <= x; i++) {
            if(x % i == 0) return false;
        }
        return true;
    }
}
