import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		if (a < b && b < c){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}