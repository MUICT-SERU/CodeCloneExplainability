import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String[] input_array = br.readLine().split(" ");
        int result = 0;

        for(String str : input_array)  {
            result += 1;
            if("0".equals(str)) break;
        }

        pw.println(result);
        br.close();
        pw.close();
    }
}