import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		Integer d = sc.nextInt();

		int pp = Math.min(b, d) - Math.max(a, c);
		if (pp < 0)
			pp = 0;
		System.out.println(pp);
	}
}
