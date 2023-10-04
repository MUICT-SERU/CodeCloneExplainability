
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	String s = scan.next();
	int[] count = new int[26];
	for (int i = 0; i < s.length(); i++) {
	    count[s.charAt(i) - 'a']++;
	}

	boolean isEven = true;
	for (int i = 0; i < 26; i++) {
	    if(count[i] % 2 != 0) {
		isEven = false;
		break;
	    }
	}

	System.out.println(isEven ? "Yes" : "No");
	scan.close();
    }
}
