import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] cities = new int[n+1];
        for (int i = 0; i < m; i++) {
            cities[scanner.nextInt()]++;
            cities[scanner.nextInt()]++;
        }
        for (int i = 1; i < n+1; i++) {
            System.out.println(cities[i]);
        }
    }
}
