import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 10000; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0){
			break;
			}else{
				System.out.println(Math.min(x, y) + " " + Math.max(x, y));
			}				
		}
	sc.close();
	}
}