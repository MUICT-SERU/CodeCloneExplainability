import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            String line = sc.nextLine();
            int length=line.length();
            for(int i=0;i<length;i++){
                char ch = line.charAt(i);
                if(Character.isLowerCase(ch)){
                    System.out.print(Character.toUpperCase(ch));
                }else if(Character.isUpperCase(ch)) {
                    System.out.print(Character.toLowerCase(ch));
                }else{
                    System.out.print(ch);
                }
            }
        }
        System.out.printf("\n");
    }
}
