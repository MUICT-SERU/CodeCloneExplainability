
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arg = br.readLine();
        String[] inputArray = arg.split(" ");
        int[] inputIntArray = new int[inputArray.length];

        for (int count = 0; count < inputIntArray.length; count++) {
            inputIntArray[count] = Integer.parseInt(inputArray[count]);
        }
        int a = inputIntArray[0];
        int b = inputIntArray[1];
        int c = inputIntArray[2];
        String retStr;

        if (a < b && b < c) {
            retStr = "Yes";
        } else {
            retStr = "No";
        }
        System.out.println(retStr);
    }
}