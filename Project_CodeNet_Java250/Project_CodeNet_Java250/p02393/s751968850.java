
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int[] nums = {num1,num2,num3};
		Arrays.sort(nums);
		
		System.out.println(String.format("%s %s %s", nums[0],nums[1],nums[2]));
		
	}
}