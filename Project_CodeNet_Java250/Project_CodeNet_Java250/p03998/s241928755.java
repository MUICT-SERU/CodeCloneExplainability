import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;
import java.lang.reflect.Array;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String[] Aarr = A.split("");
		String B = sc.nextLine();
		String[] Barr = B.split("");
		String C = sc.nextLine();
		String[] Carr = C.split("");
		String[][] arr = new String[3][];
		arr[0] = Aarr;
		arr[1] = Barr;
		arr[2] = Carr;
		int Acount = 0;
		int Bcount = 0;
		int Ccount = 0;
		String answer = null;
		boolean fin = false;
		int i = 0;
		int j = 0;
		
		while (!fin) {
			if (i == 0) {
				j = Acount;
				Acount++;
				if (Acount > A.length()) {
					fin = true;
					answer = "A";
				}
			} else if (i == 1) {
				j = Bcount;
				Bcount++;
				if (Bcount > B.length()) {
					fin = true;
					answer = "B";
				}
			} else {
				j = Ccount;
				Ccount++;
				if (Ccount > C.length()) {
					fin = true;
					answer = "C";
				}
			}
			if (!fin) {
				if (arr[i][j].equals("a")) {
					i = 0;
				} else if (arr[i][j].equals("b")) {
					i = 1;
				} else {
					i = 2;
				}
			}
		}
		System.out.println(answer);
		
	}
}
