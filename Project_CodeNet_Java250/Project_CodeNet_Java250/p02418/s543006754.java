import java.util.Scanner;

public class Main {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.concat(s);
        String p = sc.next();
        if(s.contains(p))System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}
