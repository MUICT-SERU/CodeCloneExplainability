// ?????????????????? compareTo
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		Scanner scan = new Scanner(System.in);
		// ?????°??????????????°???
		int n = scan.nextInt();
		// ???????????????????´????????????°
		int taro = 0;
		int hanako = 0;
		// ?????????????????????????????§??°?????????
		for(int i = 0; i<n; i++) {
			// ??????????????????
			String taroCard = scan.next();
			String hanakoCard = scan.next();
			// ??????????????????????????????
			int x = taroCard.compareTo(hanakoCard);
			
			if (x > 0) taro = taro +3;
			else if (x < 0) hanako = hanako +3;
			else{
				taro = taro + 1;
				hanako = hanako +1;
			}
		}
		// ??????
		System.out.println(taro + " " + hanako);

	}

}