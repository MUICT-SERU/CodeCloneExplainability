import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main (String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    System.out.print(input.replaceAll("[a-z]","x"));
  }
}