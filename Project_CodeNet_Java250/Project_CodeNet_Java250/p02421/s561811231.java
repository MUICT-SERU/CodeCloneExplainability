

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//????????£?????????????????????
		Scanner sc = new Scanner(System.in);
		//??£?¨?
		int HanakoPoint = 0;
		int TaroPoint = 0;
		//??????????????°?????????
		int n = sc.nextInt();
		//???????????° ??°?????????
		for(int i = 0; i< n; i++){
			//???????????????
			String Tarocard = sc.next();
			//??±????????????
			String Hanakocard = sc.next();
			//???????????????????????????
			if(Tarocard.compareToIgnoreCase(Hanakocard) < 0){
			//?????? 3????????????
				HanakoPoint += 3;
			}else if(Tarocard.compareToIgnoreCase(Hanakocard) == 0){
			//???????????? //1????????????
				TaroPoint ++;
				HanakoPoint++;
			}else{
			//?????? 0????????????
				TaroPoint += 3;
			}
		}
			//??????????????????????????¨???
			System.out.println(TaroPoint + " "+ HanakoPoint);
	}
}