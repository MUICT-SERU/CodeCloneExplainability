

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean[] minColors = new boolean[8];
		boolean[] maxColors = new boolean[8];
		int countMaxRate = 0;
		for(int i = 0; i < n; i++){
			int score = in.nextInt();
			int rate = score / 400;
			if(rate < 8){
				minColors[rate] = true;
				maxColors[rate] = true;
			}else{
				countMaxRate++;
			}
		}
		for(int i = 0; i < countMaxRate; i++){
			boolean hasFound = false;
			for(int j = 0; j < 8; j++){
				if(minColors[j]){
					hasFound = true;
					break;
				}
			}
			if(!hasFound){
				minColors[0] = true;
				break;
			}
		}
		int min = getCount(minColors);
		int max = getCount(maxColors) + countMaxRate;
		System.out.println(min + " " + max);
		in.close();
	}
	int getCount(boolean[] a){
		int count = 0;
		for(boolean b : a){
			if(b) count++;
		}
		return count;
	}

}
