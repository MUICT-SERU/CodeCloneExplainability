import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//n?????\?????????????????±?????°
		int kousya[][][] = new int[4][3][10];
		for(int cnt1 = 0; cnt1 < 4; cnt1++){//kousya???????????????????????????
			for(int cnt2 = 0; cnt2 < 3; cnt2++){
				for(int cnt3 = 0; cnt3 < 10; cnt3++){
					kousya[cnt1][cnt2][cnt3] = 0;
				}
			}
		}
		for(int cnt_n = 0; cnt_n < n; cnt_n++){//??°????????\?????????
			int house = scan.nextInt();//?£?
			int floor = scan.nextInt();//?£????????????¢
			int room = scan.nextInt();//????????¢?????????
			int nin = scan.nextInt();//??????????????°????¢??????°
			kousya[house - 1][floor - 1][room - 1] += nin;//??????????????°?¢???????????????????
		}	

			for(int cnt1 = 0; cnt1 < 4; cnt1++){//kousya??????????????????
				for(int cnt2 = 0; cnt2 < 3; cnt2++){
					for(int cnt3 = 0; cnt3 < 10; cnt3++){
						System.out.print(" " + kousya[cnt1][cnt2][cnt3]);
					}
					System.out.println();
				}
				if(cnt1 != 3){//??????????£???\????????????????????????????????????#????????\??????
					System.out.println("####################");
				}
			}
			scan.close();
	}
}