import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);

        System.out.println( a <= 5 ? 0 : a <= 12 ? b / 2 : b );

    }

}
