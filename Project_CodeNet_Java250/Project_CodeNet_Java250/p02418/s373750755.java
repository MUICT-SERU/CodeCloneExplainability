

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = scan.next();
		String p = scan.next();
		int result;
		result = -1;// ?????????
		char c;
		List<String> list = new ArrayList<String>();

		// ????????????????????????????????????????´?

		for (int count = 0; count < str.length(); count++) {
			c = str.charAt(count);
			// char??????String??????????????????
			list.add(String.valueOf(c));
		}
		for (int i = 0; i < str.length(); i++) {
			
			//?????????????????????????????????????????????
			String min = list.get(0);
			
			// ??????????????????
			for (int count2 = 1; count2 <= str.length(); count2++) {
				
				
				// list???????????????????????????????????????p???????????????????????????????????????????????????????????????
				// list?????????String???
				if (count2 == str.length()) {
					sb.append(min);
					list.set(count2-1, min);
				} else {
					//StringBuilder?????\?????????????????????????????????????????????
					sb.append(list.get(count2));
					list.set(count2-1, list.get(count2));
				}
				//System.out.print(list.get(count2 - 1));
			}
				result = sb.indexOf(p);
				// ????????????????????????????????? ????????´???0 ??????????????´???-1
				if (result == 0) {
					break;
				}
				str = new String(sb);
				sb.delete(0, sb.length());
			
		}
		if (result == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}