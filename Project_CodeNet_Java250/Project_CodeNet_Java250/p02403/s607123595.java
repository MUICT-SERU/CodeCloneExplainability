import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int exception(int h,int w){
		int result = 0;
		if(0 < h && h <= 300 && 0 < w && w <= 300){ //??????????????????
			result = 2;
		}
		else if(h == 0 && w == 0){
			result = 1;
		}
		else{
			System.out.println("1~300????????§.???????????????.");
			result = 0;
		}
		return result;
	}
	public static void main(String[] args) {
		/**
		 * ?????°?????£?¨?
		 */
		int a = 0;
		int t = 0, inc = 0;
		int h = 0,w = 0; //height:h width:w
		int count = 0;
		int x = 0;
		/**
		 * ???????????£?¨?
		 */
		ArrayList<String> st = new ArrayList<String>();
		ArrayList<Integer> parse = new ArrayList<Integer>();
		/**
		 * ????¨???????????????\???
		 */
		Scanner scan = new Scanner(System.in);
		while(a == 0){
		for (t = 0; t < 2; t++){ //??´??°2???????????????
		st.add(scan.next());
		}
		//System.out.println(""); //????????????????????\???????????????
		h = Integer.parseInt(st.get(inc));
		w = Integer.parseInt(st.get(inc+1));
		parse.add(h);
		parse.add(w);

		if(exception(h,w) == 1){ //h=w=0?????¨??????????????????????????????
			break;
		     }
		inc = inc + 2; //???????????§?????°
		}
		/**
		 * ??????
		 */
		for(int n= 1; n < ((parse.size())/2) ; ++n){ //???????????°??????
		 for(int i = 0; i < parse.get(2*(n-1)); ++i){
			for(int j = 0; j < parse.get(2*n-1); ++j){
				System.out.print("#");
			}
			System.out.println("");
		 }
		 System.out.println("");
		}
	}
}