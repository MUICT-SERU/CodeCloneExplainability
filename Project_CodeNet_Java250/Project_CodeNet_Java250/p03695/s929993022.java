import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int score[] = new int[N];

		for (int i = 0; i < N; i++) {
			score[i] = scan.nextInt();
		}
		
		int count[] = new int [8];
		
		int var = 0;
		
		for(int i = 0; i < N; i++){
			
			
		if(score[i] <= 399){
			count[0]++;
		} else if(score[i] <= 799){
			count[1]++;
		} else if(score[i] <= 1199){
			count[2]++;
		} else if(score[i] <= 1599){
			count[3]++;
		} else if(score[i] <= 1999){
			count[4]++;
		} else if(score[i] <= 2399){
			count[5]++;
		} else if(score[i] <= 2799){
			count[6]++;
		} else if(score[i] <= 3199){
			count[7]++;
		} else if(score[i] >= 3200){
			var++;
		}

		}
		
		
		int min = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				min++;
			}
		}
		
		int max = min + var;
		if (min == 0) {
			min = 1;
		}
		
		System.out.print(min + " ");
		System.out.println(max);
		//System.out.println(Arrays.toString(count));
		//System.out.println(counter);
		//System.out.println(all);
	}

}

