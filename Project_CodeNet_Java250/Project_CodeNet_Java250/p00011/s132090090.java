import java.util.*;
class Main{
 
    public static void main(String args[]){
    int w,n;
    int[][] Edge;
    int[] Ans;
    Scanner in = new Scanner(System.in);
    String[] s;
 
      
    w = in.nextInt();
    n = in.nextInt();
    Edge = new int[w+1][2];
    Ans = new int[w+1];
    for(int i=1;i<=w;i++)Ans[i] = i;
    for(int i=0;i<n;i++){
        s = in.next().split(",");
        Edge[i][0] = Integer.valueOf(s[0]).intValue();
        Edge[i][1] = Integer.valueOf(s[1]).intValue();
        int h = Ans[Edge[i][0]];
        Ans[Edge[i][0]] = Ans[Edge[i][1]];
        Ans[Edge[i][1]] = h;
    }
     
    for(int i=1;i<=w;i++)System.out.println(Ans[i]);
 
    }
 
 
 
}
