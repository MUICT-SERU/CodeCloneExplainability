import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int y = 0;
		for(int i =0; i < x.length(); i++){
			y += Character.getNumericValue(x.charAt(i));
		}
		if(y % 9 == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}