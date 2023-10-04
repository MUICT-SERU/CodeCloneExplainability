import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class TrumpFinding { // ?????????????????¢????????????
	void finding(ArrayList<String> taroTrump) {
		for (int i = 0; i < 13; ++i) { // S???????????¨??¨???.??????????????¨????????????H,C,D??¨???????§?
			if (taroTrump.contains("S " + (i + 1)) == false) { // ????????????????????????????????????????????????????????????????????????????????°???
				System.out.println("S " + (i + 1)); // contains??????????????§??°?????????????????£?????????????????????????????¨???
			}
		}
		for (int i = 0; i < 13; ++i) { // H???????????¨??¨???.??????????????¨????????????H,C,D??¨???????§?
			if (taroTrump.contains("H " + (i + 1)) == false) { // ????????????????????????????????????????????????????????????????????????????????°???
				System.out.println("H " + (i + 1)); // contains??????????????§??°?????????????????£?????????????????????????????¨???
			}
		}
		for (int i = 0; i < 13; ++i) { // C???????????¨??¨???.??????????????¨????????????H,C,D??¨???????§?
			if (taroTrump.contains("C " + (i + 1)) == false) { // ????????????????????????????????????????????????????????????????????????????????°???
				System.out.println("C " + (i + 1)); // contains??????????????§??°?????????????????£?????????????????????????????¨???
			}
		}
		for (int i = 0; i < 13; ++i) { // D???????????¨??¨???.??????????????¨????????????H,C,D??¨???????§?
			if (taroTrump.contains("D " + (i + 1)) == false) { // ????????????????????????????????????????????????????????????????????????????????°???
				System.out.println("D " + (i + 1)); // contains??????????????§??°?????????????????£?????????????????????????????¨???
			}
		}
	}
}

public class Main {
	public static void main(String[] args) throws IOException { // S,H,C,D
		int n = 0;
		TrumpFinding tf = new TrumpFinding();
		ArrayList<String> taroTrump = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // ?????????????????£???????????????????????°
		for (int i = 0; i < n; ++i) { // ?????????????????£??????????????????????¨???¶
			taroTrump.add(br.readLine());
		}
		tf.finding(taroTrump); // ??????????????¢?´¢????????????????????????
	}
}