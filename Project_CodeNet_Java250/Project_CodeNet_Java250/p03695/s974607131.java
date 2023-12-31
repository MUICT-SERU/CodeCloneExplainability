import java.util.*;

public class Main{ // Main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<Integer> fixed = new HashSet<>();
		int free = 0;
		for(int i = 0; i < n; i ++) {
			int a = scanner.nextInt();
			if(a / 400 < 8) {
				fixed.add(a / 400);
			} else {
				free ++;
			}
		}
		int min = 0;
		int max = 0;
		if(fixed.isEmpty()) {
			min = 1;
			max = free;
		} else {
			min = fixed.size();
			max = min + free;			
		}
		System.out.println(min + " " + max);
		
		scanner.close();
	}
}