import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_5_C
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    static final String HASHMARK = "#";
    static final String DOTMARK  = ".";
    
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                
                int h = Integer.valueOf(inputs[0]);
                int w = Integer.valueOf(inputs[1]);
                
                if (h == 0 && w == 0) {
                    break;
                    // nothing to do.
                }
                
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if ( ( j-i ) %2 != 0) {
                            System.out.print(DOTMARK);
                        } else {
                            System.out.print(HASHMARK);
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}