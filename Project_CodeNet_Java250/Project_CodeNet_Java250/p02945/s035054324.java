import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        System.out.println(Math.max(Math.max(a+b, a-b), a*b));
    }
}