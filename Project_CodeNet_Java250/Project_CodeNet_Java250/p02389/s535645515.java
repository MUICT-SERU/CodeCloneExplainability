import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//System.out.println("??\???>>");

		Scanner scan = new Scanner(System.in);

		int intTate = scan.nextInt();
		int intYoko = scan.nextInt();


		//System.out.println(intTate + " " + intYoko);

		int intArea = intTate * intYoko;

		int intOutLine = (intTate + intYoko) * 2;

		System.out.println(intArea + " " + intOutLine);

	}

}