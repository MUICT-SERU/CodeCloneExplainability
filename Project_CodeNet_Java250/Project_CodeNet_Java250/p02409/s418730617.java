import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int b=1; b<=4; b++){
            for (int f=1; f<=3; f++){
                for (int r=1; r<=10; r++){
                    Dom.allRes.add(new Dom(b, f, r, 0));
                }
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String hashs =  HashMarks(20).toString();
        for (int i=0; i<n; i++){
            String[] line = br.readLine().split(" ");
            int bb = Integer.parseInt(line[0]);
            int ff = Integer.parseInt(line[1]);
            int rr = Integer.parseInt(line[2]);
            int vv = Integer.parseInt(line[3]);
            
            for (Dom dom: Dom.allRes){
                if (dom.b != bb || dom.f != ff || dom.r != rr){
                    continue;
                }else{
                    dom.v += vv;
                }
            }
        }
        int cnt = 0;
        for (Iterator<Dom> d = Dom.allRes.iterator(); d.hasNext();){
            Dom dom = d.next();
            cnt += 1;
            System.out.print(" " + dom.v);
            if (cnt%10==0){
                System.out.println();
            }
            if (!d.hasNext()){
                break;
            }
            if (cnt%30==0){
                System.out.println(hashs);
            }
        }
    }
    private static StringBuilder HashMarks(int n){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++){
            sb.append("#");
        }
        return sb;
    }
}
class Dom {
    final int b; //?£?
    final int f; //???
    final int r; //??????
    int v; //???
    static List<Dom> allRes = new ArrayList<Dom>();
    
    Dom (int b, int f, int r, int v){
        this.b = b;
        this.f = f;
        this.r = r;
        this.v = v;
    }
}