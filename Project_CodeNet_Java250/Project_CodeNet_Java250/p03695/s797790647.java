import java.util.*;
public class Main {
  public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int cnt[] = new int[N];
      int cnt1 = 0;
      int cnt2 = 0;
      int cnt3 = 0;
      int cnt4 = 0;
      int cnt5 = 0;
      int cnt6 = 0;
      int cnt7 = 0;
      int cnt8 = 0;
      int cnt9 = 0;
      int min = 0;
      int max = 0;
      for (int  i = 0 ; i < N ; i++) {
        int a = sc.nextInt();
        if (a >= 1 && a <= 399) {
          cnt1 = 1;
        } else if (a >= 400 && a <= 799) {
          cnt2 = 1;
        } else if (a >= 800 && a <= 1199) {
          cnt3 = 1;
        } else if (a >= 1200 && a <= 1599) {
          cnt4 = 1;
        } else if (a >= 1600 && a <= 1999) {
          cnt5 = 1;
        } else if (a >= 2000 && a <= 2399) {
          cnt6 = 1;
        } else if (a >= 2400 && a <= 2799) {
          cnt7 = 1;
        } else if (a >= 2800 && a <= 3199) {
          cnt8 = 1;
        } else if (a >= 3200 && a <= 4800) {
          cnt9++;
        } 
      }
      min = cnt1 + cnt2 + cnt3 + cnt4 + cnt5 + cnt6+ cnt7 + cnt8;
      max = min + cnt9;
      if (min == 0) {
        min = 1;
      }
      System.out.println(min + " " + max);
  }
}