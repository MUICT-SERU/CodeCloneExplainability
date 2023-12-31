import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int c = Integer.parseInt(str[2]);
    int k = Integer.parseInt(in.readLine());
    int max = Math.max(Math.max(a,b),c);
    int min = Math.min(Math.min(a,b),c);
    int middle = a+b+c-max-min;
    System.out.println(max*(int)Math.pow(2,k)+min+middle);
  }
}