import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=s.charAt(0);
		if(Character.isUpperCase(c))
			System.out.print("A");
		else
			System.out.print("a");
	}
}