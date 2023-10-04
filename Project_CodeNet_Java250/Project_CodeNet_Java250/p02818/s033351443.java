import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long A, B, K;
	long x, y;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		A = Long.parseLong(tokens[0]);
		B = Long.parseLong(tokens[1]);
		K = Long.parseLong(tokens[2]);
	}

	void calc() {
		x = A;
		y = B;
		x = A - K;
		if (x < 0) {
			y = B + x;
			x = 0;
			if (y < 0) {
				y = 0;
			}
		}
	}

	void showResult() {
		System.out.println(x + " " + y);
	}
}