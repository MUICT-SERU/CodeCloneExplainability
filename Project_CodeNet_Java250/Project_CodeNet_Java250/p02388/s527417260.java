import java.util.Scanner;

class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int xcube = x * x * x;
      System.out.println(xcube);
      sc.close();
   }
}