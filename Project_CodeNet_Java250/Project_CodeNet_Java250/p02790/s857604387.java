import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        List<String> mylist = new ArrayList<>();

        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();

        while (strinput != null) {

            mylist.add(strinput);
            strinput = reader.readLine();

        }

        String arr01[] = mylist.get(0).split(" ");

        int a = Integer.valueOf(arr01[0]);
        int b = Integer.valueOf(arr01[1]);

        StringBuffer sb = new StringBuffer();
        if (a == b) {
            for (int i = 1; i <= a; i++) {
                sb.append(String.valueOf(a));
            }
        } else if (a > b) {
            for (int i = 1; i <= a; i++) {
                sb.append(String.valueOf(b));
            }

        } else if (a < b) {
            for (int i = 1; i <= b; i++) {
                sb.append(String.valueOf(a));
            }

        }

        System.out.println(sb.toString());

    }

}