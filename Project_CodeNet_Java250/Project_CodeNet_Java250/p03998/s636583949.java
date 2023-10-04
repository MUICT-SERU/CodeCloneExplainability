import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a_list = br.readLine().split("");
        String[] b_list = br.readLine().split("");
        String[] c_list = br.readLine().split("");

        Deque<String> a, b, c;
        a = new ArrayDeque<String>(Arrays.asList(a_list));
        b = new ArrayDeque<String>(Arrays.asList(b_list));
        c = new ArrayDeque<String>(Arrays.asList(c_list));

        String turn = "a";
        while (turn != null) {
            switch (turn) {
                case "a":
                    turn = a.poll();
                    if (turn == null) System.out.println("A");
                    break;
                case "b":
                    turn = b.poll();
                    if (turn == null) System.out.println("B");
                    break;
                case "c":
                    turn = c.poll();
                    if (turn == null) System.out.println("C");
                    break;
            }
        }
    }

}
