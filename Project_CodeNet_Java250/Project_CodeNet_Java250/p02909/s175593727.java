import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		if(S.equals("Sunny")){
			System.out.println("Cloudy");
		}
		else if(S.equals("Cloudy")){
			System.out.println("Rainy");
		}
		else{
			System.out.println("Sunny");
		}
		stdIn.close();
	}
}
