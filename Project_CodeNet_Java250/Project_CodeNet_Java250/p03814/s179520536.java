import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str =  scanner.next();
        int length_a = 0;
        int length_z = 0;
        int margin;

        String[] strArray = new String[str.length()];
        ArrayList<String> mojiArray = new ArrayList<String>();

        for(int i = 0; i < str.length(); i ++){
            char str2 = str.charAt(i);

            if(str2 == 'Z'){
                length_z = i;
            }
        }

        for(int i = 0; i < str.length(); i ++){
            char str3 = str.charAt(i);

            if(str3 == 'A') {
                length_a = i;
                break;
            }
        }
        margin = length_z - length_a + 1;
        System.out.println(margin);
    }
}
