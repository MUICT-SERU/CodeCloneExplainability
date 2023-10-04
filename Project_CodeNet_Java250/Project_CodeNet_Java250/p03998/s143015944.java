import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	static String Sa, Sb, Sc;
	static StringBuilder a, b, c;
	static Map<Character, StringBuilder> map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Sa = br.readLine();
		Sb = br.readLine();
		Sc = br.readLine();
		a = new StringBuilder(Sa);
		b = new StringBuilder(Sb);
		c = new StringBuilder(Sc);
		map = new HashMap<Character, StringBuilder>();
		map.put('a', a);
		map.put('b', b);
		map.put('c', c);
		char turn, next = 'a';
		while (true) {
			turn = next;
			if (map.get(turn).length() == 0) {
				System.out.println(Character.toUpperCase(turn));
				return;
			}
			next = map.get(turn).charAt(0);
			map.put(turn, map.get(turn).deleteCharAt(0));
		}
	}
}
