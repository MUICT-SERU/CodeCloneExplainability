import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if(str.matches("[A-Z]")){
            System.out.println("A");
        }
        else{
            System.out.println("a");
        }
    }
}