
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	String s = scan.next();
	int fromIndex = 0;
	for (int i = 0; i < s.length(); i++) {
	    if(s.charAt(i) == 'A') {
		fromIndex = i;
		break;
	    }
	}
	int toIndex = 0;
	for (int i = s.length()-1; i > -1; i--) {
	    if(s.charAt(i) == 'Z') {
		toIndex = i;
		break;
	    }
	}

	System.out.println(toIndex - fromIndex + 1);
	scan.close();
    }
}
