import java.text.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num= new int[1];

		num[0] = scan.nextInt();
		int hako = 0;
		int keta = 1;
		int w = 1;
		for(int i = 1;i <= num[0]; i++) {
			int x = i;
			if(i % 3 == 0) {
				System.out.print(" " + i);
			}else {
				/*while(true) {
					if(i / w == 0) break;
					keta++;
					w = w * 10;
				}*/
				while(x != 0) {
					if(x % 10 == 3) {
						System.out.print(" " + i);	
						break;
					}else {
						hako = x /w;
						x = x/10;
					}
					
				}
			}
		}
		System.out.println();
	}
}