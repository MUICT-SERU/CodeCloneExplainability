import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int n = in.nextInt();
        Integer[] a = new Integer[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
            sum += a[i];
        }
        int prevSum = 0, ans = 0;
        int already = (int) 1e9;
        for (int i = 0; i < n-1; i++){
            prevSum += a[i];
            already = Math.min(already, Math.abs(prevSum - (sum-prevSum)));
        }
        out.pl(already);
        out.close();
    }
}
class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 
    public FastReader() { 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 
    String next(){ 
        while (st == null || !st.hasMoreElements()) { 
            try{ 
                st = new StringTokenizer(br.readLine()); 
            }catch (IOException  e){ 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 
    int nextInt(){ 
        return Integer.parseInt(next()); 
    } 
    long nextLong(){ 
        return Long.parseLong(next()); 
    } 
    double nextDouble(){ 
      return Double.parseDouble(next()); 
    } 
    String nextLine(){ 
        String str = ""; 
        try{ 
            str = br.readLine(); 
        } 
        catch (IOException e){ 
            e.printStackTrace(); 
        } 
        return str; 
    } 
}
class FastWriter{
    PrintWriter out;
    FastWriter(){
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	out.flush();
    }
    void pl(Object o){
        out.write(o.toString());
	    out.write("\n");
        out.flush();
    }
    void pl(){
        out.write("\n");
    }
    void p(Object o){
        out.write(o.toString());
    }
    void close(){
        out.flush();
        out.close();
    }  
}
