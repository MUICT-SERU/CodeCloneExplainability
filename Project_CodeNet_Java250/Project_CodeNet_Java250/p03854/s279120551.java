import java.lang.StringBuffer;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer string = new StringBuffer(scanner.next());

        while(true) {
            int length = string.length();
            if (length == 0) {
                System.out.println("YES");
                break;
            }
            if (length >= 5 && string.substring(length - 5, length).equals("dream")) {
                string.delete(length - 5, length);
            } else if (length >= 7 && string.substring(length - 7, length).equals("dreamer")) {
                string.delete(length - 7, length);
            } else if (length >= 5 && string.substring(length - 5, length).equals("erase")) {
                string.delete(length - 5, length);
            } else if (length >= 6 && string.substring(length - 6, length).equals("eraser")) {
                string.delete(length - 6, length);
            } else {
                System.out.println("NO");
                break;
            }
        }
    }
}
