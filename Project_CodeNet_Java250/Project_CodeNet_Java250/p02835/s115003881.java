import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int a =  sc.nextInt();
	int b =  sc.nextInt();
	int c =  sc.nextInt();
	int sum = a+b+c;

	System.out.println(sum>=22?"bust":"win");
  }
}