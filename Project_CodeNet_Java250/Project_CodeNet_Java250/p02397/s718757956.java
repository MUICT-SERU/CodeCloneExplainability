import java.util.Scanner;
class Main {
	public void aa() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		while(x != 0 || y != 0) {
			if(x < y) {
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		new Main().aa();
	}
}