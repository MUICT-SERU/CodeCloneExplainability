import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int N = sc.nextInt();//羊
		int X = sc.nextInt();//  
           String x = (N>X) ?"safe":"unsafe";
           System.out.println(x);
     }
    }
