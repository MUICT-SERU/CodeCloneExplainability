import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);

        System.out.println(++alphabet);
    }
}
