import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		
		// ??\???
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\r\\n");
		
		// ??????
		int count[];
		count = new int[26];
		while(scan.hasNext()) {
			String S = scan.nextLine();
			// ???????????????
			int sl = S.length();
			// ?°???????????????????
			String s = S.toLowerCase();
			// 1????????\???char??????????´?
			char[] charArray = s.toCharArray();
			for (char ch : charArray) {
				int CH = ch;
				// a-z?????°??????
				if(((CH-97)>=0) && ((CH-97)<26)){
					count[CH-97]++;
				}
			}
		}
		// ??????
		for (int i=0; i<26; i++) {
			int cords = i + 97;
			char c = (char)cords;
			System.out.println(c + " : " + count[i]);
		}

		
	}

}