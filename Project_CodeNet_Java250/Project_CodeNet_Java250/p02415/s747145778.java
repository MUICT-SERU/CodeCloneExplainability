

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[])throws IOException {
		//BufferedReader??§??????????????????input??????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		str = br.readLine();
		char c;
		
		//??????????????????????????????
		for(int count=0;count<str.length();count++){
			c = str.charAt(count);
			// ??§???????????¨???true
			if (Character.isUpperCase(c)) {
				//?°????????????????
				//String???????????´???????°????????????????
				sb.append(String.valueOf(c).toLowerCase());
			} else {
				//??§???????????????
				//String???????????´????????§???????????????
				sb.append(String.valueOf(c).toUpperCase());
			}
		}
		System.out.println(new String(sb));
	}
}