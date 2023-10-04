
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	StringBuilder str = new StringBuilder(scan.next());
	String[] key = new String[]{"dream", "dreamer", "erase", "eraser"};
	
	boolean flag = true;
	while(flag) {
	    flag = false;

	    for(int i=0; i<key.length; i++) {
		int index = str.length() - key[i].length();
		if( index > -1) {
		    if(str.substring(index).equals(key[i])) {
			str.delete(index, str.length());
			flag = true;
			break;
		    }
		}
	    }
	}
	System.out.println(str.length() == 0 ? "YES" : "NO");
	scan.close();
    }
}
