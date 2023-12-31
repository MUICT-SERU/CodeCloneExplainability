import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String regex = "(.)\\1{1}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);

		System.out.println(m.find() ? "Bad" : "Good");
	}
}