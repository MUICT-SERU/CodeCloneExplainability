import java.io.*;
import java.util.*;

public class Main{
	public static void main (String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		System.out.println((int)Math.ceil((b-1)/(a-1.0)));
	}
}