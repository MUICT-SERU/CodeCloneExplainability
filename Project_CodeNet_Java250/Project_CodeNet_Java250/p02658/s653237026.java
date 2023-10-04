import java.util.*;

class Problem {
  int n;
  long[] a;
  long MAX = 1;
  
  public Problem(int n, long[] a) {
    this.n = n;
    this.a = a;
    for (int i = 0; i < 18; i++) MAX *= 10;
  }

  public void solve() {
    System.out.println(calc());
  }

  public long calc() {
    if (hasAnyZero()) return 0;
    long ans = 1;
    for (int i = 0; i < n; i++) {
      if (MAX / ans < a[i]) return -1;
      ans *= a[i];
    }
    return ans;
  }

  public boolean hasAnyZero() {
    for (int i = 0; i < a.length; i++) if (a[i] == 0) return true;
    return false;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextLong();
    Problem p = new Problem(n, a);
    p.solve();
  }
}

