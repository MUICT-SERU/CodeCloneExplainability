
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		//?????£????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		while(true){
			String moji = sc.next();

			//?????????-?????£????????????
			if(moji.equals("-")){
				break;
			}

			//??°??????????????°???????????????
			int h = sc.nextInt();

			//
			for(int i = 0; i < h; i++){
				int c = sc.nextInt();

				String left = moji.substring(0,c);
				String right = moji.substring(c);

				moji = right + left ;
			}

			System.out.println(moji);
		}
	}
}