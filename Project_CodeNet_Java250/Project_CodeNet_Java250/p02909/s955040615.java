import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		switch(input) {
	        case "Sunny":
	            System.out.println("Cloudy");
	            break;
	        case "Cloudy":
	            System.out.println("Rainy");
	            break;
	        case "Rainy":
	            System.out.println("Sunny");
	            break;
		}
	}
}