import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String w = scanner.next();
		
		String[] W = w.split("");
		
		int i=0, j=0, cnt=0;
		for(i=0; i<W.length; i++ ){
			
			for(j=0; j<W.length; j++ ){
				if(W[i].equals(W[j])){
					cnt++;
				}
			}
			if(!((cnt%2)==0)){
				System.out.println("No");
				return;
			}
			cnt = 0;
		}
		System.out.println("Yes");
	}
}