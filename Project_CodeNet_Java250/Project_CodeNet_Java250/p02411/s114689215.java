public class Main {
    public static void main(String[] args) {

        // ??????????????????????????????.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // ?????????????????????????????????.
        // ??¨???????????? - 1 ?????´?????????????????¢??????.
        // ?????°???????????????????????????.
        int f = -2;
        int m = -2;
        int r = -2;
        while (true) {
            f = sc.nextInt();
            m = sc.nextInt();
            r = sc.nextInt();
            if (m == - 1 && f == - 1 && r == - 1) { break; }

            // ??????????¨??????????????¨????????????????????¬????????????´???????????? F
            if (m == - 1 || f == - 1) { System.out.print("F\n"); }
            else {
                // ??????????¨???¨??????????¨????????¨??????°??? 80 ??\???????????°????????? A
                if (m + f >= 80) { System.out.print("A\n"); }
                // ??????????¨???¨??????????¨????????¨??????°??? 65 ??\??? 80 ??????????????°????????? B
                if (m + f >= 65 && m + f < 80) { System.out.print("B\n"); }
                // ??????????¨???¨??????????¨????????¨??????°??? 50 ??\??? 65 ??????????????°????????? C
                if (m + f >= 50 && m + f < 65) { System.out.print("C\n"); }
                // ??????????¨???¨??????????¨????????¨??????°??? 30 ??\??? 50 ??????????????°????????? D
                // ?????????, ???????¨?????????°??? 50 ??\???????????°????????? C
                if (m + f >= 30 && m + f < 50) {
                    if (r >= 50) { System.out.print("C\n"); }
                    else { System.out.print("D\n"); }
                }
                // ??????????¨???¨??????????¨????????¨??????°??? 30 ??????????????°????????? F
                if (m + f < 30) { System.out.print("F\n"); }
            }
        }
    }
}