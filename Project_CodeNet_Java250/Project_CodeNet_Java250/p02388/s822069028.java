import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = Integer.parseInt(sc.nextLine());
            System.out.println(x * x * x);
        } catch (NoSuchElementException | NumberFormatException e) {
            System.out.println(e);
            return;
        }
    }
}

