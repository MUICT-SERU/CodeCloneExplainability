import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		if(x==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}


	}
}
