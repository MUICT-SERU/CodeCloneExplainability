
import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
      boolean[] colors = new boolean[8];
      int master = 0;
      int N = Integer.parseInt(in.readLine());
      for(String s: in.readLine().split(" ")){
        int rating = Integer.parseInt(s);
        for(int i=0;i<8;i++){
          if(rating < (i+1)*400){
            colors[i] = colors[i] || true;
            break;
          }
        }
        if(rating>=3200){
          master++;
        }
      }
      int cnt=0;
      for(int i=0;i<8;i++){
        if(colors[i]){
          cnt++;
        }
      }
      int min = Math.max(1, cnt);
      int max = cnt+master;
      System.out.println(min+" "+max);
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
