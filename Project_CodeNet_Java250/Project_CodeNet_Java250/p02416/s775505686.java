import java.util.Scanner;

/**
 * @author SS-1029
 *
 */
public class Main {

	public static void main(String[] args) {

		//??\??????????????????????????????Scanner???????????§???????????????
		Scanner scan = new Scanner(System.in);


		while(true){
			//??????????????????
			String x = scan.nextLine();
			//???????????¶
			if(x.charAt(0) == '0'){
				break;
			}
			//???????????¨???
			System.out.println(getSum(x));
		}
	}

	/*
	 * ?¨??????????????????????
	 * @param String x
	 * @param return int sum
	 */
	public static int getSum(String x) {

		//??????????????£?¨?
		int sum = 0;
		//char?????????????????°?????????
		for(int i = 0; i < x.length(); i++){
			//String?????????????????°?????????
			sum += Integer.parseInt(String.valueOf(x.charAt(i)));
		}
		return sum;
	}

}