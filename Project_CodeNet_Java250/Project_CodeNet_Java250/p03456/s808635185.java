
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.sqrt(Integer.valueOf(sc.next() + sc.next())) % 1d == 0 ? "Yes" : "No");
	}
}