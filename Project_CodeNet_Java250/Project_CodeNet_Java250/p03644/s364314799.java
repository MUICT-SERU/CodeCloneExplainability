import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] pow2 = {1,2,4,8,16,32,64};
		for(int i = 6; i >= 0; i--){
			if(N >= pow2[i]){
				System.out.println(pow2[i]);
				break;
			}
		}
	}
}