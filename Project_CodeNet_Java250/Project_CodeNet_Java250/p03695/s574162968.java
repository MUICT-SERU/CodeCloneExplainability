import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        boolean[] isColor = new boolean[8];
        int min = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a >= 3200){
                count++;
            }else {
                isColor[a/400] = true;
            }
        }
        for (boolean ic:isColor) {
            if (ic){
                min++;
            }
        }
        System.out.println(Math.max(min, 1) + " " + (min+count));

    }
}
