import java.util.Scanner;
class Main{


	static char[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0;i < n;i++){
			p[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int i = 0;i < n-2;i++){
			if((p[i] < p[i+1] && p[i+1] < p[i+2] )||( p[i] > p[i+1] && p[i+1] > p[i+2])){
				ans++;
			}
		}

		System.out.println(ans);


	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   end- otherpair.end;
	}







	static int find(int index,int current,int[] students,int ans,int[][] memo){
		if(current == index){
			return 1;
		}

		if(memo[current][index] != 0){
			return memo[current][index];
		}

		memo[current][index] = find(index, students[current]-1, students, ans+1, memo)+1;

		return memo[current][index];
	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}




