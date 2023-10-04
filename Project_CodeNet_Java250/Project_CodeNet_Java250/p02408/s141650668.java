

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 52????????????????????????
		int[][] cards = new int[4][13];

		Scanner in = new Scanner(System.in);
		int all_num = in.nextInt();

		// ?????????????????????????????????????´?
		for(int i = 0; i < all_num; i++){

			String mark = in.next();
			int num = in.nextInt();

			if(mark.equals("S")){

				cards[0][num - 1] = 1;

			}else if(mark.equals("H")) {

				cards[1][num - 1] = 1;

			}else if(mark.equals("C")) {

				cards[2][num - 1] = 1;

			}else if(mark.equals("D")) {

				cards[3][num - 1] = 1;
			}
		}

		// ????????¨?????????????????????????????????
		char[] marks = {'S', 'H', 'C', 'D'};

		// ???????????????????????§?¶????????????????????????????
		for(int i = 0; i < 4; i++) {

			for(int j = 0; j < 13; j++) {

				if(cards[i][j] == 0){

					System.out.println(marks[i] + " " + (j + 1));

				}
			}
		}
	}
}