import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int v1 = n*(n-1)/2;
        int v2 = m*(m-1)/2;

        System.out.println(v1+v2);

    }


    public static void main(String[] args) {

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


    class Counter extends HashMap<Integer, Integer> {
        public int get(int k) {
            return containsKey(k) ? super.get(k) : 0;
        }

        public void add(int k, int v) {
            put(k, get(k) + v);
        }
    }



    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

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

    static class Trie {
        void add(String word) {

        }

        boolean search(String w) {
            return false;
        }
    }

    static class Node1 {
        public int val;
        public List<Node1> children;

        public Node1() {
        }

        public Node1(int _val, List<Node1> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    static class TrieNode {

    }

    static class KvNode implements Comparable<KvNode> {
        String key;
        int freq;

        public KvNode(String key, int freq) {
            this.key = key;
            this.freq = freq;
        }

        @Override
        public int compareTo(KvNode o) {
            if (this.key.equals(o.key)) {
                return 0;
            }
            return Integer.compare(o.freq, this.freq);
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
