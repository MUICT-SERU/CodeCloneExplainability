import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rate[] = {0,0,0,0,0,0,0,0};
		int exCollers = 0;
		int N = sc.nextInt();
		int i = 0;
		int tmp = 0;
		int tmp2 = 0;
		while(i<N){
			tmp = sc.nextInt();
			tmp2 = (int)tmp/400;
			if(tmp2>=8){
				exCollers++;
			}else{
				rate[tmp2]=1;
			}
			i++;
		}
		int min = 0;
		for(int j=0;j<=7;j++){
			min += rate[j];
		}
		int max = min + exCollers;
		
		if(min == 0){
			min =1;
		}
		System.out.println(min + " " + max);
	}
 
}