import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		ou.print(Math.PI * 2.0 * n + "\n");
		ou.flush();
    }
}