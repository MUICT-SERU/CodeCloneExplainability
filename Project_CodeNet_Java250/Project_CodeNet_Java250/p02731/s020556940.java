import java.io.*;
import java.util.*;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int l = sc.nextInt();
        double len=l/(double)3;
        out.printf("%.12f",len*len*len);
        out.flush();
        out.close();
    }

    //solution functions here

    /*
     * ******************************************************************************************************************************
     * ******************************************************************************************************************************
     * ******************************************************************************************************************************
     * #########  #######  ######   ########  ##  ###   ##  ##    ##   #######  ##    ##   #######  ##   ##  #######   ########
     * ##    ###  ##       ##       ########  ##  ## #  ##   ##  ##    ##       ##    ##   ##       ##  ##   ##        ##    ##
     * ##    ###  #######  ######      ##     ##  ##  # ##     ##      #######  ##    ##   ##       ####     #######   ########
     * ##    ###  ##           ##      ##     ##  ##   ###     ##      ##       ##    ##   ##       ##  ##   ##        ##   ##
     * #########  #######  ######      ##     ##  ##    ##     ##      ##       ########   #######  ##   ##  #######   ##     ##
     *******************************************************************************************************************************
     *******************************************************************************************************************************
     *******************************************************************************************************************************
     */

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}

/* *****************************************************************************************************************************
 * I'M NOT IN DANGER, I'M THE DANGER!!!
 * *****************************************************************************************************************************
 */