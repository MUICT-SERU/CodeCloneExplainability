import java.util.ArrayList;
import java.util.Scanner;
class Main{

	
	static char[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力



		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double ans = 0;
		double tate = 0;
		double yoko = 0;
		tate = Math.min(H-y, y)*W;
		yoko = Math.min(W-x, x)*H;
		ans = (double)W*H/2;
		int v = 0;
		if(x * 2 == W && y * 2 == H){
			v =1;
		}
		System.out.print(ans + " " + v);
		
	}
	
	static int rsearch(int y,int x){
		
		int count = 0;
		while(x < map[0].length && map[y][x] != '#'){
			count++;
			x++;
		}
		return count;	
		
	}

	static int csearch(int y,int x){
		
		int count = 0;
		while(y < map.length && map[y][x] != '#'){
			count++;
			y++;
		}
		return count;	
	}


	static boolean checkswitch(int bit,int[] k,ArrayList<ArrayList<Integer>> list,int[] p,int m){

		//		System.out.println("bit " + bit);

		for(int i = 0;i < m;i++){

			ArrayList<Integer> sub = list.get(i);
			int onnum = 0;						//onの数
			for(int j = 0;j < sub.size();j++){
				//				System.out.println("sub "+ sub.get(j));
				if((bit & (1 << sub.get(j))) != 0){				//目的のスイッチがついているか
					onnum++;
					//					System.out.println("on  ");
				}

			}
			if(onnum % 2 != p[i]){				//一個でも電球がつかなかったらout
				return false;
			}

		}


		return true;

	}

	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}





}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  otherpair.end - end;
	}
}


