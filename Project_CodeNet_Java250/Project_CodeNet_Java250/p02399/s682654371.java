import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	    /**
	     * ??????????????????
	     * @param a
	     * @param b
	     * @return
	     */
 public static int integer(int a,int b){
	 int result1 = 0;
	 result1 = a / b;
	 return result1;
	}
 public static int too(int a,int b){
	 int result2 = 0;
	 result2 = a % b;
	 return result2;
	}
 public static double fpn(double aa,double bb){ //fpn:Floting Point Numbers.
	 double result3 = 0.0;
	 result3 = aa / bb;
	 return result3;
	}

	public static void main(String[] args) {
		/**
		 * ?????°?????£?¨?
		 */
		int a,b,d,r;
		double f,aa,bb;
		int len1;
		/**
		 * ???????????£?¨?
		 */
		ArrayList<String> st = new ArrayList<String>();
		ArrayList<Integer> parse = new ArrayList<Integer>();
		ArrayList<Integer> bet = new ArrayList<Integer>();
		/**
		 * ?????????????????\?????¨????????????????´?
		 */
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 2; i++){ //??\?????´??°???2???
		st.add(scan.next());
		}
		len1 = st.size(); //?????????????´???°
		/**
		 * String???int??????,int???????????????????´?
		 */
		a = Integer.parseInt(st.get(0));
		parse.add(a);
		b = Integer.parseInt(st.get(1));
		parse.add(b);
		/**
		 * String???double??????
		 */
		aa = Double.parseDouble(st.get(0));
		bb = Double.parseDouble(st.get(1));
		/**
		 * ????????\?¨?
		 */
		d = integer(a,b);
		r = too(a,b);
		f = fpn(aa,bb);

		System.out.printf(d+(" ")+r+(" "));
		System.out.printf("%6.5f\n",f);
	}

}