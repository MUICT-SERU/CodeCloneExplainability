import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		HashMap<String,String> map = new HashMap<String,String>();
		for (int i = 0; i < line.length(); i++) {
			String s = String.valueOf(line.charAt(i));
			String a = map.get(s);
			if (a == null) {
				map.put(s, s);
			}
			else {
				map.put(s, a + s);
			}
		}
		String result = "Yes";
		Iterator<String> it = map.values().iterator();
		while (it.hasNext()) {
			String s = it.next();
			if (s.length() % 2 == 1) {
				result = "No";
				break;
			}
		}
		System.out.println(result);
	}
}
