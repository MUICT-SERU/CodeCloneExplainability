import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//??????????????°?¨????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str, reverse;
		int num;

		while ((str = br.readLine()) != null){
			//????????????????????°????????????
			reverse = "";
			num = str.length();
			char[] word = new char[num];
			//??????
			for (int i = 0; i < num; i++) {
				word[i] = str.charAt(i);
			}
			//?????????
			for (int i = num-1; i >=0; i--) {
				reverse = reverse + word[i];
			}
			//??????
			System.out.println(reverse);
		}

	}

}