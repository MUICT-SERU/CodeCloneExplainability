import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//System.out.println("??\???>>");

		Scanner scan = new Scanner(System.in);

		int intA = scan.nextInt();
		int intB = scan.nextInt();

		if(intA == intB ){
			System.out.println("a == b");
		}else if(intA < intB){
			System.out.println("a < b");
		}else {
			System.out.println("a > b");
		}

	}

}