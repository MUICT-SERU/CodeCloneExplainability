
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        Task task = new Task();
        task.solve(sc, out);
        out.flush();
        sc.close();
    }
    static class Task{
        public void solve(Scanner sc, PrintWriter out){
            String S = nstr(sc);
            String T = nstr(sc);
            List<String> SList = new ArrayList<>();

            for(int i = 0; i < S.length(); i++){
                String x = String.valueOf(S.charAt(i));
                SList.add(x);
            }
            List<String> TList = new ArrayList<>();
            for(int i = 0; i < T.length(); i++){
                String x = String.valueOf(T.charAt(i));
                TList.add(x);
            }

            for (int i=0; i<SList.size(); i++){
                String tmp = SList.get(SList.size()-1);
                SList.remove(SList.size()-1);
                SList.add(0, tmp);
                if (SList.equals(TList)){
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");

        }
    }

    static int nint(Scanner sc){
        return Integer.parseInt(sc.next());
    }
    static long nlong(Scanner sc){
        return Long.parseLong(sc.next());
    }
    static double ndouble(Scanner sc){
        return Double.parseDouble(sc.next());
    }
    static float nfloat(Scanner sc){
        return Float.parseFloat(sc.next());
    }
    static String nstr(Scanner sc){
        return  String.valueOf(sc.next());
    }
    static long[] longLine(Scanner sc, int size){
        long[] lLine = new long[size];
        for (int i = 0; i < size; i++) {
            lLine[i] = nlong(sc);
        }
        return lLine;
    }
    static int[] intLine(Scanner sc, int size){
        int[] iLine = new int[size];
        for (int i = 0; i < size; i++) {
            iLine[i] = nint(sc);
        }
        return iLine;
    }
    static String[] strLine(Scanner sc, int size){
        String[] strLine = new String[size];
        for (int i = 0; i < size; i++) {
            strLine[i] = nstr(sc);
        }
        return strLine;
    }
}