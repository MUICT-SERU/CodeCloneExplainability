import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }

        boolean flag = true;
        int swapCount = 0;
        while (flag) {
            flag = false;
            for (int j = size - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(j, j - 1, array);
                    swapCount++;
                    flag = true;
                }
            }
        }
        System.out.println(concat(array));
        System.out.println(swapCount);
    }

    private static String concat(int[] array) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int value : array) {
            joiner.add(String.valueOf(value));
        }
        return joiner.toString();
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}