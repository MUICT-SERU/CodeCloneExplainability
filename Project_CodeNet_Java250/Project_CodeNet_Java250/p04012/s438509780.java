import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String w = input.readLine();

        boolean[] checkedArr = new boolean[w.length()];
        boolean isBeautiful = true;


        for (int i = 0; i < w.length(); i++) {
            int testChar = w.charAt(i);
            int count = 0;
            for (int j = 0; j < w.length(); j++) {
                if (testChar == w.charAt(j)) {
                    count += 1;
                }
            }

            if (!isEven(count)) {
                isBeautiful = false;
                break;
            }
        }

        if (isBeautiful) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}