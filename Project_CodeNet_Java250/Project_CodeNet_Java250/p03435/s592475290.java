import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][]c = new int [3][3];
		int []a = new int [3];
		int []b = new int [3];
		int []sum = new int [3];
		
		for(int i = 0; i < 3 ;i++) {
			for(int j = 0; j < 3;j++) {
				c[i][j] = sc.nextInt();
			}
		}
		
		boolean jdg = true;
		
		b[0] = c[0][0];
		b[1] = c[0][1];
		b[2] = c[0][2];
		a[0] = 0;
		a[1] = c[1][0] - c[0][0];
		a[2] = c[2][0] - c[0][0];
		
		for(int i = 0; i < 3 ;i++) {
			for(int j = 0; j < 3 ;j++) {
				if(c[i][j] != a[i] + b[j]) {
					jdg =false;
					break;
				}
			}
		}
		
				
		if(jdg) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
