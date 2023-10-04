import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt(), road = sc.nextInt();
        int[] result = new int[city];
        while(sc.hasNextInt()) {
            int i = sc.nextInt();
            result[i - 1] += 1;
        }
        for (int r : result) {
            System.out.println(r);
        }
    }
}
