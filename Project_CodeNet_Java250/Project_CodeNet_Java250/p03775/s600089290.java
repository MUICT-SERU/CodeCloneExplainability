import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();    
        long N = r.l();
        int root = (int)Math.sqrt(N)+1;
        int factor = 1;
        for(int i = 2; i <= root; i++)
            if(N%i == 0)
                factor = i;
        println(Math.max(digit(factor), digit(N/factor)));
    }
    static int digit(long n){
        int d = 0;
        while(n > 0){
            d++;
            n /= 10;
        }
        return d;
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
    }
    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
}