import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0,c = 0;
        String as = in.nextLine();
        String bs = in.nextLine();
        String cs = in.nextLine();

        char now = 'a';
        while(true){
            switch (now) {
            case 'a':
                if(a == as.length()){
                    System.out.println("A");
                    return;
                }
                now= as.charAt(a++);
                break;
            case 'b':
                if(b == bs.length()){
                    System.out.println("B");
                    return;
                }
                now= bs.charAt(b++);
                break;
            case 'c':
                if(c == cs.length()){
                    System.out.println("C");
                    return;
                }
                now= cs.charAt(c++);
                break;
            }
        }
    }
}