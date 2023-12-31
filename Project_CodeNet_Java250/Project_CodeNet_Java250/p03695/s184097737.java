import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean[] b = new boolean[8];
		Arrays.fill(b, false);
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		int c = 0;
		for(int i = 0 ; i < n; i++){
			list.add(scanner.nextInt());
		}

		for(int a : list){
			if(a < 400){
				set.add(1);
			}else if (a < 800) {
				set.add(2);
			}else if (a < 1200) {
				set.add(3);
			}else if (a < 1600) {
				set.add(4);
			}else if (a < 2000) {
				set.add(5);
			}else if (a < 2400) {
				set.add(6);
			}else if (a < 2800) {
				set.add(7);
			}else if (a < 3200) {
				set.add(8);
			}else {
				c++;
			}
		}
		c += set.size();
		if(set.size() == 0){
			System.out.println(1 + " " + c);
		}else {
			System.out.println(set.size() + " " + c);
		}
	}
}
