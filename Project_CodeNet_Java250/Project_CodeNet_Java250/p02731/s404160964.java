import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    double l = Integer.parseInt(in.readLine());
    System.out.println(Math.pow(l/3,3));
  }
}