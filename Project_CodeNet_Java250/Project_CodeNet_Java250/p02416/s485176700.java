import java.util.Scanner;

public class Main {


		public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			int num = 0;
			String moji = scan.next();
			int moji_len = moji.length();
			//??§????????¨?°????????????\??????????????????
			for(int cnt_len = 0; cnt_len < moji_len; cnt_len++){
				char moji_one = moji.charAt(cnt_len);
				String moji_str = String.valueOf(moji_one);
				int moji_int = Integer.decode(moji_str);
				num += moji_int;
			}
			//0?????\???????????????????????¨?????????????????????
			if(num == 0)
				break;
			else
				System.out.println(num);
		}
		//????§????
		scan.close();
	}
}