import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        boolean ans=(s.indexOf('7')>=0);
        if(ans) System.out.println("Yes");
        else System.out.println("No");
    }
}
