import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int temp = 0;

    temp = a;
    a = b;
    b = temp;

    temp = a;
    a = c;
    c = temp;

    System.out.println(a+" "+b+" "+c);
  }
}