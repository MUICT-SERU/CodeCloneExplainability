import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int month = Integer.parseInt(s.substring(5,7));
        if(month<=4){
            System.out.println("Heisei");
        }else{
            System.out.println("TBD");
        }
        sc.close();
    }
    
}