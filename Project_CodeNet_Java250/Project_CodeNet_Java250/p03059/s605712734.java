import  java.util.*;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sec = sc.nextInt();
    int per_num = sc.nextInt();
    double max_sec = (double)sc.nextInt() + 0.5;

    int ans_num = 0;

    for (int i = sec; i < max_sec; i += sec) {
      ans_num += per_num;
    }

    System.out.println(ans_num);
  }
}
