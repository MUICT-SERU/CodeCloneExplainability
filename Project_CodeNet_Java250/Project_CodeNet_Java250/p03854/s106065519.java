import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        if (S.matches("(dream|dreamer|erase|eraser)+?")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}