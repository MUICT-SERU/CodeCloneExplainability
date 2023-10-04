import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		int[] nums = new int[N];
		for(int i = 0; i< N ; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		if(!(nums[nums.length/2]-nums[nums.length/2-1]==0)) {
			System.out.println(nums[nums.length/2]-nums[nums.length/2-1]);
		}else {
			System.out.println(0);
		}
	}

}
