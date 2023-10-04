import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// ???????????°?????????
		int count = sc.nextInt();

		// ??????????????????????´?
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			list.add(sc.next());
		}

		// ???????????????????????\?????????
		Collections.reverse(list);
		
		// ?????????????????§??£???????????????
		System.out.println(String.join(" ", list));
	}
}