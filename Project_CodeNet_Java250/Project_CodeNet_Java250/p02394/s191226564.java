import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int r = sc.nextInt();

    if(x < r || y < r || x+r > W || y+r > H){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}

