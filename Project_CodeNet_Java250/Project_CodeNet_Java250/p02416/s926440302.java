import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (1) true???????????\?????????????????????
	// (1.1) ???????????????????´????????????°sum???????????????
	// (1.2) ??????????????????????????????
	// (1.3) ?????????0???????????????????????´????????\?????????????????????
		// (1.3.1) ?????????????????????
	// (1.4) ??????????????????????????????????????°?????????1??????????????\?????????????????????
		// (1.4.1) ????±???¨??????1?????????char??????????????????
		// (1.4.2) char?????????????????????????????°?????????????????????
		// (1.4.3) ????¨?????????°sum????????°???????¶??????????????????????
	// (1.5) sum?????¨?????????

public class Main {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int sum = 0;
			String num = br.readLine();

			if (num.equals("0")){
				break;
			}

			for (int i = 0;i < num.length();i++){
				char number = num.charAt(i);
				int numberCal = Character.getNumericValue(number);
				sum += numberCal;
			}
			System.out.println(sum);
		}
	}
}