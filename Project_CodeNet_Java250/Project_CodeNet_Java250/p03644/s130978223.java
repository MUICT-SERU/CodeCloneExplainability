import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int n = Integer.parseInt(input);
		
		int m = n;
		int pow = 0;
		do {
			m /= 2;
			pow++;
		}while(m > 1);
		
		int result = 1;
		if(m == 1) {
			for(int i = 0; i < pow; i++) {
				result *= 2;
			}
		} else {
			result = n;
		}
		System.out.println(result);		
		
	}

}
