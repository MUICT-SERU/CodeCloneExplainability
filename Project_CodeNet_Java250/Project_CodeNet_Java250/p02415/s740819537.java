import java.util.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if('a' <= c && c <= 'z') System.out.print((char)(c - 32));
			else if('A' <= c && c <= 'Z') System.out.print((char)(c + 32));
			else System.out.print(c);
		}
		System.out.println();
	}
}