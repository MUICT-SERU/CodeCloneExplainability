import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		while (true) {
			draw(h,w);
			System.out.println();
			h = sc.nextInt();
			w = sc.nextInt();
			if (h == 0 && w == 0)
				break;
		}

	}

	public static void draw(int h, int w) {
		for (int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}