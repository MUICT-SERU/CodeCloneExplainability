import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int[] k = new int[w];
		for(int i = 0; i < w; i++){
			k[i] = i+1;
		}
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String s = sc.next();
			int h = 0;
			for(h = 0; h < s.length(); h++){
				if(s.charAt(h) == ','){
					break;
				}
			}
			int a = Integer.parseInt(s.substring(0,h));
			int b = Integer.parseInt(s.substring(h+1,s.length()));
			//swap(k[a-1], k[b-1]);
			int c = k[a-1];
			k[a-1] = k[b-1];
			k[b-1] = c;
		}
		for(int i = 0; i < w; i++){
			System.out.println(k[i]);
		}
	}
}