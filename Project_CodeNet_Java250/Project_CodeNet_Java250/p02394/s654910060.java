import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/* ??¶?´??????????????????? */
	public static int judge(ArrayList<Integer> parse2) {
		int result=0;
		if (parse2.get(0) <= 0 || parse2.get(0) > 100) {
			result = 0;
		} else if (parse2.get(1) <= 0 || parse2.get(1) > 100) {
			result = 1;
		} else if (parse2.get(2) < -100 || parse2.get(2) > 100) {
			result = 2;
		} else if (parse2.get(3) < -100 || parse2.get(3) > 100) {
			result = 3;
		} else if (parse2.get(4) <= 0 || parse2.get(4) > 100) {
			result = 4;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		int w, h, x, y, r;
		String str1,str2,str3,str4,str5;

		/**
		 * ????????????????????¨???
		 */
		ArrayList<String> st = new ArrayList<String>();
		ArrayList<Integer> parse2 = new ArrayList<Integer>(); //int??????

		/**
		 * ??\?????¨????????????????´?
		 */
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
		st.add(scan.next());
		}
		str1 = st.get(0);
		str2 = st.get(1);
		str3 = st.get(2);
		str4 = st.get(3);
		str5 = st.get(4);

		w = Integer.parseInt(str1); parse2.add(w);
		h = Integer.parseInt(str2); parse2.add(h);
		x = Integer.parseInt(str3); parse2.add(x);
		y = Integer.parseInt(str4); parse2.add(y);
		r = Integer.parseInt(str5); parse2.add(r);


		/* ????????¨???????????? */


		if ((x - r < 0 || x + r > w) || (y - r < 0 || y + r > h)){
			System.out.println("No");
		}
		else if ((x - r >= 0 && x + r <= w) && (y - r >= 0 && y + r <= h)){
			System.out.println("Yes");
		}
		/**
		 * judge??????????????§??\???????????????
		 */
		else if (judge(parse2)==0){
			System.out.println("w?????\?????????1~100??\???????????§???.???????????????.");
		}
		else if (judge(parse2)==1){
			System.out.println("h?????\?????????1~100??\???????????§???.???????????????.");
		}
		else if (judge(parse2)==2){
			System.out.println("x?????\?????????-100~100??\???????????§???.???????????????.");
		}
		else if (judge(parse2)==3){
			System.out.println("y?????\?????????-100~100??\???????????§???.???????????????.");
		}
		else if (judge(parse2)==4){
			System.out.println("r?????\?????????1~100??\???????????§???.???????????????.");
		}

	}

}