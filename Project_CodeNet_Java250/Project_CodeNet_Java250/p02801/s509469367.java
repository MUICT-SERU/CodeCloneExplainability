import java.io.IOException;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();
            char[] c = s.toCharArray();
 
            System.out.println((char)(c[0]+1));
        }
    }
}
