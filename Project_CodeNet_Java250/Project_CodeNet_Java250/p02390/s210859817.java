import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int h = a / 3600;
	int m = (a % 3600)/60;
	int s = (a % 3600)%60;
	System.out.println(h+":"+m+":"+s);
	}
}