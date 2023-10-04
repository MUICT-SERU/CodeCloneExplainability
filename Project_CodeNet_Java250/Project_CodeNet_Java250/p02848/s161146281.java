import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int x = in.nextInt();
        char[] s = in.nextLine().toCharArray();
        for (int i = 0; i < s.length; i++){
            if ((int)s[i]+x > 90){
                int a = ((int)s[i])-26+x;
                out.p((char)a);
            }else{
                out.p((char)(((int)s[i])+x));
            }
        }
        out.pl();
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
