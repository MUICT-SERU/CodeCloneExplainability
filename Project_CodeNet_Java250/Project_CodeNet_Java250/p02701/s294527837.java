import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
        int n = scan.nextInt();
        Set<String>set = new HashSet<>();
        for(int i=0;i<n;i++) {
            String s = scan.next();
            set.add(s);
        }

        System.out.println(set.size());

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//            int res = scase(n);
//            System.out.println(res);
//            solveCase(i, n, strs);
//        }
    }

    static void solveCase(int t, int n, String[] strs) {
//
//        System.out.println("Case #" + (t+1) + ": " + res);
    }


//    static int scase(int n) {
//
//    }


    public static void main(String[] args) {

//
        solve();

        //        Main m = new Main();
        //        Scanner scan = new Scanner(System.in);

        //        long n = scan.nextLong();
        //        long r = scan.nextLong();
        //        List<Long> list = new ArrayList<>();
        ////        int[] arr = new int[n];
        //        for (long i=0;i<n;i++){
        //            list.add(scan.nextLong());
        //        }
//            System.out.println(ch);
        //        solve(n, arr);
        //        scan.close();
    }


//
//    class Counter extends HashMap<Integer, Integer> {
//        public int get(int k) {
//            return containsKey(k) ? super.get(k) : 0;
//        }
//
//        public void add(int k, int v) {
//            put(k, get(k) + v);
//        }
//    }


//    static class Node {
//        int val;
//        Node next;
//        Node random;
//
//        public Node(int val) {
//            this.val = val;
//            this.next = null;
//            this.random = null;
//        }
//    }

//    static class Node {
//        int key;
//        int data;
//        Node next;
//        Node prev;
//
//        Node(int key, int data) {
//            this.key = key;
//            this.data = data;
//        }
//    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
