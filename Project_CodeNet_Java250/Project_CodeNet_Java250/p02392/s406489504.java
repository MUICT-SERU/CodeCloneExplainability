import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.start();
		
		
	}

	private void start() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a < b && b < c){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}