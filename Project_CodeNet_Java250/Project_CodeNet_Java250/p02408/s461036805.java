

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//????????£?????????????????????
		Scanner sc = new Scanner (System.in);
		//ArrayList
		ArrayList<String> array = new ArrayList<String>();
		//????????????????????°?????????
		int card = sc.nextInt();
		//???????????????????????°???????´?
		for(int i = 0; i <= card; i++){
			array.add(sc.nextLine());
		}

		//???S??? ???????????? ???????????????????????¨???
		for(int i = 1; i < 14; i++){
			//???????????????????????¨("????????? " ????????????????????????)????????´????????????????????° -1??????????????? false??¨?????????-1?????????
			//-1(???????????????)????£?????????°??¨???
			if(array.contains("S " + i) ==false){
				System.out.println("S " + i);
			}
		}
		//???H??? ????????? ???????????????????????¨???
		for(int i = 1; i < 14; i++){
			//???????????????????????¨("????????? " ????????????????????????)????????´????????????????????° -1??????????????? false??¨?????????-1?????????
			//-1(???????????????)????£?????????°??¨???
			if(array.contains("H " + i) ==false){
				System.out.println("H " + i);
			}
		}
		//???C??? ??????????????? ???????????????????????¨???
		for(int i = 1; i < 14; i++){
			//???????????????????????¨("????????? " ????????????????????????)????????´????????????????????° -1??????????????? false??¨?????????-1?????????
			//-1(???????????????)????£?????????°??¨???
			if(array.contains("C " + i) ==false){
				System.out.println("C " + i);
			}
		}
		//???D??? ????????? ???????????????????????¨???
		for(int i = 1; i < 14; i++){
			//???????????????????????¨("????????? " ????????????????????????)????????´????????????????????° -1??????????????? false??¨?????????-1?????????
			//-1(???????????????)????£?????????°??¨???
			if(array.contains("D " + i) ==false){
				System.out.println("D " + i);
			}
		}
	}
}