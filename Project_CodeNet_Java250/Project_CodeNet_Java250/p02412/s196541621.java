import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        int n, x, p = 0; /* p:????????????????????°*/

        /*??\???????????????????????????*/
        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf = br.readLine();
        StringTokenizer st = new StringTokenizer(buf," ");
        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        
        while(true) {
        	if (n == 0 && x == 0) break;
            int i, j, k;
            
            for (i = 1;i <= n - 2;i++) {
                for (j = i + 1;j <= n - 1;j++) {
                    for (k = j + 1;k <= n;k++) {
                        if (i + j + k == x) p++;
                    }
                }
            }
            
            /*????????????????????° p?????????*/
            System.out.println(p);
            
            /* p?????????????????????*/
            p = 0;
            
            /*?¬??????\???????????????????????????*/
            buf = br.readLine();
            st = new StringTokenizer(buf," ");
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
        }
    }
}