/* 
   10022 ??則???????属???????????????\???????????????n?????蔵???
   "??則????????即?属???????????????\?????????"?????????????????????????????????????????????
*/
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public  static void main(String[] args){
    solve();
    }
    static void solve(){
    String n = kbd.next();
    int ans = 0;
    while(kbd.hasNext()){
        String s = kbd.next();
        if(s.equals("END_OF_TEXT")){
        System.out.println(ans);
        }
        else{
        if(n.compareToIgnoreCase(s)==0){ // ????????????????????????????????????
            ans++;
        }
        }
    }
    }
}