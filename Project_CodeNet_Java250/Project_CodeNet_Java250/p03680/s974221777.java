

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		int count = 0;
		int i = 0;
		while(true){
			if(i == 1){
				break;
			}else if(count > 100000){
				break;
			}
			i = a[i]-1;
			count++;
		}
		if(count != 100001){
			System.out.println(count);
		}else{
			System.out.println(-1);
		}
		in.close();
	}
}
