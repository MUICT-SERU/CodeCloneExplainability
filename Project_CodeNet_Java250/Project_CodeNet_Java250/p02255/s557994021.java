import java.util.Scanner; public class Main { public static void main(String[] args) { Solve.run(); } } class Solve { private static int N; private static int[] vec; static void run() { input(); solve(); } static void input() { Scanner sc = new Scanner(System.in); N = sc.nextInt(); vec = new int[N]; for (int i = 0; i < N; i++) { vec[i] = sc.nextInt(); } } static void solve() { int tmp; for (int i = 0, j; i < N; i++) { tmp = vec[i]; j = i - 1; while (j >= 0 && vec[j] > tmp) { vec[j + 1] = vec[j]; j--; } vec[j + 1] = tmp; for (int i1 = 0; i1 < vec.length; i1++) { System.out.print(vec[i1]); if (i1 != vec.length - 1) { System.out.print(" "); } } System.out.println(); } } } 