

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//????????£????????????????????°?????????????????£?¨?
		Scanner sc = new Scanner(System.in);
		//??°?????????
		while(true){
			//???????????°???
			int intA = sc.nextInt();
			//??????
			String strOp = sc.next();
			//???????????°???
			int intB = sc.nextInt();
			//?????¶strOp????????????????¨????
			if("+".equals (strOp)){
				System.out.println(intA + intB);
			}else if("-".equals (strOp)){
				System.out.println(intA - intB);
			}else if("*".equals (strOp)){
				System.out.println(intA * intB);
			}else if("/".equals (strOp)){
				System.out.println(intA / intB);
			}else if("?".equals(strOp)){
				break;
			}
		}
	}
}