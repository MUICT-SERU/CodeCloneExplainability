import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		while (H != 0 && W != 0) {
			display(H, W);
			H = sc.nextInt();
			W = sc.nextInt();
		}
	}

	private static void display(int h, int w) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if ((i + 1) % 2 == 0) {
					if ((j + 1) % 2 == 0) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}					
				} else {
					if ((j + 1) % 2 == 0) {
						System.out.print(".");
					} else {
						System.out.print("#");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}