import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strArray = br.readLine().split("\\s");
            Integer[] intArray = new Integer[3];
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.valueOf(strArray[i]);
            }
            if (intArray[0] < intArray[1] & intArray[1] < intArray[2]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}