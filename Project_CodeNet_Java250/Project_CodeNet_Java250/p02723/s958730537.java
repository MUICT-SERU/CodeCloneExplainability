import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			
			String str3 = str.substring(2, 3);
			String str4 = str.substring(3, 4);
			String str5 = str.substring(4, 5);
			String str6 = str.substring(5, 6);
				
			if(str3.equals(str4) && str5.equals(str6)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
				}
			}
		
}