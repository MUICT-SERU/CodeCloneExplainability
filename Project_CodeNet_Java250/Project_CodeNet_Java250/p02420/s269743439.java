import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// ???????????????
			String x = scan.next();
			if (x.equals("-")) break;
			// ?????£??????????????°
			int m = scan.nextInt();
			// ?????????????????????????????????
			int l = x.length();
			// ?????£????????????????????????????´????????????°
			String kekka =  x;
			for(int i=0; i<m; i++){
				// ????????????????????????????´????????????°
				int h = scan.nextInt();
				String new_x = kekka.substring(0, h);
				String new_x2 = kekka.substring(h, l);
				kekka = new_x2 + new_x;
			}
			// ???????????????
			System.out.println(kekka);
		}

	}

}