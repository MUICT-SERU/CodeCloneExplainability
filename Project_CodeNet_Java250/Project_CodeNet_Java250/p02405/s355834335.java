import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int hei, wid, cnt_wid;

		while(true){
			hei = scan.nextInt();//??????????????????
			wid = scan.nextInt();//?¨????????????????
			if(hei == 0 && wid == 0){//???????????????0???0????????\???????????????????????????
				break;
			}
			for(int cnt_hei = 0; cnt_hei < hei; cnt_hei++){//?????????????????????
				for(cnt_wid = 0; cnt_wid < wid; cnt_wid++){//?¨???????????????????
					if(cnt_hei % 2 == 0){//??¶??°???????\???°???????????????
						if(cnt_wid % 2 == 0){
							System.out.print("#");
						}
						else{
							System.out.print(".");
						}
					}else{
						if(cnt_wid % 2 == 0){
							System.out.print(".");
						}
						else{
							System.out.print("#");
						}
					}
						
				}
				System.out.println();
			}
		System.out.println();
		}
        scan.close();
    }
}