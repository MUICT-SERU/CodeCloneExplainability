import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		char[] targ = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for ( int i = 0; i < targ.length; i++ ) {
			if ( !map.containsKey(targ[i]) ) {
				map.put(targ[i], 1);
			} else {
				map.put(targ[i], map.get(targ[i]) + 1);
			}
		}

		boolean ok = true;

		for ( Entry<Character, Integer> c : map.entrySet() ) {
			if ( c.getValue() != 2 ) {
				ok = false;
				break;
			}
		}

		if ( ok && map.size() == 2 ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		in.close();
	}
}
