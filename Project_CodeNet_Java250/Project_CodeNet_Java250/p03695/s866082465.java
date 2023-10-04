import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N;
	int[]a; //max4800
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[N];
		int[] color=new int[9];
		
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
			if(a[i]<3200)color[a[i]/400]++;
			else color[8]++;
		}
		
		int cnt=0;
		for(int i=0;i<8;i++){
			if(color[i]>0){
				cnt++;
			}
		}
		
		if(color[8]>0){
			if(cnt==8)System.out.println(8+" "+(cnt+color[8]));
			else if(cnt==0)System.out.println(1+" "+color[8]);
			else System.out.println(cnt+" "+(cnt+color[8]));
		}else{
			System.out.println(cnt+" "+cnt);
		}
	}
}
