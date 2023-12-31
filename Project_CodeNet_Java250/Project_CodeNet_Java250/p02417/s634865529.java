import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[26];
		
		while (sc.hasNext()) {
			String str = sc.nextLine();
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if (Character.isUpperCase(c))
					cnt[c - 'A']++;
				else if (Character.isLowerCase(c))
					cnt[c - 'a']++;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c : %d\n", 'a' + i, cnt[i]);
		}
	}
}
