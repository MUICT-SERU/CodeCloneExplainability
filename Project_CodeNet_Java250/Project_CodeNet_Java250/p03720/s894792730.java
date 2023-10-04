import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().run();
    }

    private void run() {
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<List<Integer>> roads = new ArrayList<List<Integer>>();
        for (int i = 0; i < N; i++) {
            roads.add(new ArrayList());
        }

        for (int i = 0; i < M; i++) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            roads.get(from).add(to);
            roads.get(to).add(from);
        }

        for (List<Integer> list : roads) {
            System.out.println(list.size());
        }
    }
}
