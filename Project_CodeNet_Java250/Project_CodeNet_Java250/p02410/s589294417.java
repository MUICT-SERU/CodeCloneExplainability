import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		//???????????£?¨??????????
		Scanner sc = new Scanner(System.in);
		int list1 [][];

		//list??????????????§????????¨??¨????????§???????????¨???
		//2?¬???????????????????
		int tate = sc.nextInt();
		int yoko = sc.nextInt();
		list1 = new int[tate][yoko];

		//2?¬?????????????????????????????????????
		for(int i = 0; i < tate; i++){
			for(int j = 0; j < yoko; j++){
				list1[i][j] = sc.nextInt();
				//System.out.print(list1[i][j]);
			}
			//System.out.println("");
		}

		//???????????£?¨?
		int list2 [];
		list2 = new int[yoko];

		//????????????????????\????????????
		for(int i = 0; i < yoko; i++){
			list2[i] = sc.nextInt();
			//System.out.println(list2[i]);
		}

		//?¨????????????????
		for(int i = 0; i < tate; i++){
			int goukei = 0;
			for(int j = 0; j < yoko; j++){
				goukei += list1[i][j] * list2[j];
			}
				System.out.println(goukei);
		}
		sc.close();
	}
}