
import java.util.Scanner;

public class Main {

	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int i=0; i<length; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		
		bubbleSort(array, length);
		printArray(array);
		System.out.println(count);
	}
	
	public static void bubbleSort(int[] array, int length) {
		for (int i=0; i<length; i++) {
			for (int j=length-1; j>i; j--) {
				if (array[j] < array[j-1]) {
					array[j-1] = array[j-1] + array[j];
					array[j] = array[j-1] - array[j];
					array[j-1] = array[j-1] - array[j];
					count++;
				}
			}
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i>0) System.out.print(" ");
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}

}

