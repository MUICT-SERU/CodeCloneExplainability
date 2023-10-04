import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // abc171_a();
    // abc171_b();
    abc171_c();
    // abc172_a();
    // abc172_b();
    // abc172_c();
    // abc173_a();
    // abc173_b();
    // abc173_c();
  }

  // int 2147483648 [ 2 * 10(9)]
  // long 9223372036854775808 [ 9 * 10(18)]

  public static void abc171_a() {
    try (Scanner sc = new Scanner(System.in)) {
      String a = sc.next();
      if (Character.isUpperCase(a.charAt(0))) {
        System.out.println("A");
      } else {
        System.out.println("a");
      }
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc171_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = parseI(sc.next());
      int k = parseI(sc.next());

      int[] prices = new int[n];
      for (int i = 0; i < n; i++) {
        prices[i] = parseI(sc.next());
      }
      Arrays.sort(prices);

      int ans = 0;
      while (0 < k) {
        ans += prices[k - 1];
        k--;
      }
      System.out.println(ans);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc171_c() {
    try (Scanner sc = new Scanner(System.in)) {

      long number = parseL(sc.next());
      char a = 'a';

      String ans = "";

      long divideCnt = 0;

      divideCnt = (number - 1) / 26;
      ans =
        number % 26 == 0 ? "z" : String.valueOf((char) (a + number % 26 - 1));

      while (true) {
        if (0 == divideCnt) {
          break;
        }
        ans = divideCnt % 26 == 0 ? "z" + ans
          : String.valueOf((char) (a + divideCnt % 26 - 1) + ans);
        divideCnt = (divideCnt - 1) / 26;
      }

      System.out.println(ans);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc172_a() {
    try (Scanner sc = new Scanner(System.in)) {
      int a = parseI(sc.next());

      System.out.println(a + (int) Math.pow(a, 2) + (int) Math.pow(a, 3));
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc172_b() {
    try (Scanner sc = new Scanner(System.in)) {
      String s = sc.next();
      String t = sc.next();
      int ansCnt = 0;
      for (int i = 0; i < s.length(); i++) {
        if (!parseS(s.charAt(i)).equals(parseS(t.charAt(i)))) {
          ansCnt++;
        }
      }
      System.out.println(ansCnt);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc172_c() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = parseI(sc.next());
      int m = parseI(sc.next());
      int k = parseI(sc.next());
      long[] nList = new long[n + 1];
      long[] mList = new long[m + 1];
      nList[0] = 0;
      mList[0] = 0;
      for (int i = 1; i <= n; i++) {
        nList[i] = nList[i - 1] + parseI(sc.next());
      }
      for (int i = 1; i <= m; i++) {
        mList[i] = mList[i - 1] + parseI(sc.next());
      }
      int ansCnt = 0;
      for (int i = 0; i <= n; i++) {
        if (k < nList[i]) {
          break;
        }
        while (k - nList[i] < mList[m])
          m--;
        ansCnt = Math.max(ansCnt, i + m);
      }
      System.out.println(ansCnt);
    }
  }

  public static void abc173_a() {
    try (Scanner sc = new Scanner(System.in)) {
      int payment = parseI(sc.next());
      int max = 10000;
      int thou = 1000;

      System.out.println((max - payment) % thou);
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc173_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int num = parseI(sc.next());

      // AC
      // WA
      // TLE
      // RE x 0
      int[] ansCount = new int[4];
      final String[] err = { "AC", "WA", "TLE", "RE" };
      Arrays.fill(ansCount, 0);

      for (int i = 0; i < num; i++) {
        String ans = sc.next();
        switch (ans) {
          case "AC":
            ansCount[0]++;
            break;
          case "WA":
            ansCount[1]++;
            break;
          case "TLE":
            ansCount[2]++;
            break;
          case "RE":
            ansCount[3]++;
            break;
        }
      }
      int count = 0;
      for (int answer : ansCount) {
        System.out.println(err[count] + " x " + answer);
        count++;
      }
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc173_c() {
    try (Scanner sc = new Scanner(System.in)) {
      int row = parseI(sc.next());
      int column = parseI(sc.next());
      int checkBlackCount = parseI(sc.next());
      int existBlack = 0;
      int ansCount = 0;
      int[][] inputList = new int[row][column];
      String input = "";
      for (int i = 0; i < row; i++) {
        input = sc.next();
        for (int x = 0; x < column; x++) {
          inputList[i][x] =
            parseI(parseS(input.charAt(x)).replace(".", "0").replace("#", "1"));
        }
      }

      for (int i = 0; i < (1 << row); i++) {
        for (int x = 0; x < (1 << column); x++) {

          for (int chRownum = 0; chRownum < row; chRownum++) {
            for (int chColNum = 0; chColNum < column; chColNum++) {
              if (inputList[chRownum][chColNum] == 1
                && ((i >> chRownum) & 1) == 0 && ((x >> chColNum) & 1) == 0) {
                existBlack++;
              }
            }
          }
          if (existBlack == checkBlackCount) ansCount++;
          existBlack = 0;

        }
      }
      System.out.println(ansCount);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static int parseI(String value) {
    return Integer.parseInt(value);
  }

  public static long parseL(String value) {
    return Long.parseLong(value);
  }

  public static double parseD(String value) {
    return Double.parseDouble(value);
  }

  public static <T> String parseS(T value) {
    return String.valueOf(value);
  }

  public static BigDecimal parseBigD(String value) {
    return new BigDecimal(value);
  }

}
