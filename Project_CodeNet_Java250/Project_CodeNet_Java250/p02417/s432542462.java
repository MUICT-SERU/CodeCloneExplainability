import static java.lang.Character.*;

import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		char alpha = 'a';
		int[] count = new int[26];
		String str;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			str = sc.next();
			str = str.toLowerCase();// ????????????????????????????°??????????????????????.isLetter?????£?????????????????????
			for (int i = 0; i < str.length(); ++i) {
				int a = str.charAt(i);
				//System.out.println(str.charAt(i) + " " + 'a'+ " "+ a);
				if(isLetter(a)){ // ?????????????????¨???????????\?????\??£???????????????????????????????£?????¨??????§????¢??????§IndexoutofBounds??????????????????.
				count[str.charAt(i) - 'a']++; // ??¢????????????????????¨????????????.??????????????????????????????????????????????????§????????????
				//System.out.println(str.charAt(i) - 'a');
				}
			}
		}
		for (int j = 0; j < 26; ++j) {
			System.out.println(alpha++ + " : " + count[j]);
		}
		sc.close();
	}
}