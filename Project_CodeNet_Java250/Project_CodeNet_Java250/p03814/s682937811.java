import static java.lang.System.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		
		String input = s.nextLine();
		
		int res = input.lastIndexOf("Z") - input.indexOf("A") + 1;
		
		out.println(res);
	}
}