

import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char c;
		String s;
		s = "";// ?????????

		// a~z?????§???????????????????´????????????????
		List<String> list = new ArrayList<String>();
		// a~z?????§???????´?(26??????
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("i");
		list.add("j");
		list.add("k");
		list.add("l");
		list.add("m");
		list.add("n");
		list.add("o");
		list.add("p");
		list.add("q");
		list.add("r");
		list.add("s");
		list.add("t");
		list.add("u");
		list.add("v");
		list.add("w");
		list.add("x");
		list.add("y");
		list.add("z");

		// ?????°???????´????????????????
		List<Integer> list2 = new ArrayList<Integer>();
		// ?????????0???????´?(26??????
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);

		// ??°???????????????
		do {

			// ??????????????????
			String str = br.readLine();
			//System.out.println(str.length());
			//if (br.ready()) {
			//}else{
			//	break;
			//}

			// ????????°????????????
			for (int count = 0; count < str.length(); count++) {
				c = str.charAt(count);
				// ?????????????°????????????????
				s = String.valueOf(c).toLowerCase();
				// 26?????????????????????
				for (int i = 0; i < 26; i++) {
					// ????????±???????????£?????´??????list2?????°??????+??????
					if (list.get(i).equals(s)) {
						list2.set(i, list2.get(i) + 1);
					}
				}
			}

		}while (br.ready());
		
		// ??¨?????????
		for (int count2 = 0; count2 < 26; count2++) {
			sb.append(list.get(count2));
			sb.append(" : ");
			sb.append(list2.get(count2));
			sb.append("\n");
		}
		
		// ????????????????????????
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(new String(sb));

	}
}