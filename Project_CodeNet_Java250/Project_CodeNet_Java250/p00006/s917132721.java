import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
			String nyumoji = scan.next();

			String outpt = "";
			for(int i = 0; i < nyumoji.length(); i++){
				outpt +=nyumoji.charAt((nyumoji.length()-1) - i);
			}
			System.out.println(outpt);
			scan.close();
	}
}