public class Main {
    public static void main(String[] srgs) {

        // ??????????????????????????????.
        // ???????????????????????´??° (?????????????´???°, ?????????????´?) ???????????????.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i ++) { array[i] = sc.nextInt(); }

        // ?????????????´????????´?????????????????????¨?????????.
        for (int i = n - 1; i >= 0; i --) {
            if (i != 0) { System.out.print(array[i] + " "); }
            else { System.out.print(array[i]); }
        }
        System.out.print("\n");
    }
}