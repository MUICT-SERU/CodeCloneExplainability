import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (1) ????????????1???????????????
// (2) ?????????????????????????????§????????¨?°??????????????????????????????????????´????????????°result???????????????
// (3) ????????????????????????????????\?????????????????????
	// (3.1) ????????????????????§??????????????\?????????????????????
		// (3.1.1) ?°?????????????????????????result???????´???????
	// (3.2) ???????????????????°???????????????\?????????????????????
		// (3.2.1) ??§????????????????????????result???????´???????
	// (3.3)???????????¢????????????????????\???????????\?????????????????????
		// (3.3.1) ??????????????????result???????´???????
// (4) result?????¨?????????


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String textInput = br.readLine();
		String result = "";

		for (int i = 0;i < textInput.length(); i++){
			if (Character.isUpperCase(textInput.charAt(i))) {
				char textInputChar = textInput.charAt(i);
				char textOutputLo = Character.toLowerCase(textInputChar);
				String strLo = String.valueOf(textOutputLo);
				result += strLo;
			}
			else if (Character.isLowerCase(textInput.charAt(i))) {
				char textInputChar = textInput.charAt(i);
				char textOutputUp = Character.toUpperCase(textInputChar);
				String strUp = String.valueOf(textOutputUp);
				result += strUp;
			}
			else{
				String strLet = String.valueOf(textInput.charAt(i));
				result += strLet;
			}
		}
		System.out.println(result);
	}
}