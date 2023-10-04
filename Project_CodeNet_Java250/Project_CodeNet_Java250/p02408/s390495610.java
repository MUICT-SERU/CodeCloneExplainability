import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//?????????????????°?????????
		String[] mark = {"S","H","C","D"};	//?????????????????????S H C D
		String markTmp;
		int num;		//??????????????°???1~13
		boolean[][] trump = new boolean[4][13];
		
		for (int i = 0; i < n; i++) {
				markTmp=sc.next();
				num=sc.nextInt();
				
				//?????£??????????????????????????§??????
				if(markTmp.equals("S")){
					trump[0][num-1]=true;
				}
				else if (markTmp.equals("H")) {
					trump[1][num-1]=true;
				}
				else if (markTmp.equals("C")) {
					trump[2][num-1]=true;
				}
				else if (markTmp.equals("D")) {
					trump[3][num-1]=true;
				}
		}
		
		//?????£??????????????????????????????
		for (int i = 0; i < trump.length; i++) {
			for (int j = 0; j < trump[i].length; j++) {
				if(trump[i][j] == false){
					System.out.println(mark[i]+" "+(j+1));
				}
			}
			
		}
	}
}