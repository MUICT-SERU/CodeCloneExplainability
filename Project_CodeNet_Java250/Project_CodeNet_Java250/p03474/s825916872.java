import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		Pattern p = Pattern.compile("^[0-9]{" + A +"}"+"[-]"+"[0-9]{" + B + "}$");
		Matcher m = p.matcher(S);
		System.out.println(m.find() ? "Yes":"No");
	}
}
