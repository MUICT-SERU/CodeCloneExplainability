import java.io.*;
import java.util.*;
class Main{
    public static class FastReader {
    
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
    
        public FastReader(InputStream stream) {
            this.stream = stream;
        }
    
        public int read() {
    
            if (numChars==-1)
                throw new InputMismatchException();
    
            if (curChar >= numChars) {
    
                curChar = 0;
    
                try {
                    numChars = stream.read(buf);
                }
                catch (IOException e) {
                    throw new InputMismatchException();
                }
    
                if(numChars <= 0)
                    return -1;
            }
    
            return buf[curChar++];
        }
    
        public String nextLine() {
    
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str = "";
    
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
    
            return str;
        }
    
        public int nextInt() {
    
            int c = read();
    
            while(isSpaceChar(c))
                c = read();
    
            int sgn = 1;
    
            if (c == '-') {
                sgn = -1;
                c = read();
            }
    
            int res = 0;
    
            do {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
    
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
    
            return res * sgn;
        }
    
        public long nextLong() {
    
            int c = read();
    
            while (isSpaceChar(c))
                c = read();
    
            int sgn = 1;
    
            if (c == '-') {
                sgn = -1;
                c = read();
            }
    
            long res = 0;
    
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
    
                res *= 10;
                res += c - '0';
                c = read();
            }
    
            while (!isSpaceChar(c));
            return res * sgn;
        }
    
        public double nextDouble() {
    
            int c = read();
    
            while (isSpaceChar(c))
                c = read();
    
            int sgn = 1;
    
            if (c == '-') {
                sgn = -1;
                c = read();
            }
    
            double res = 0;
    
            while (!isSpaceChar(c) && c != '.') {
    
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
    
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
    
                res *= 10;
                res += c - '0';
                c = read();
            }
    
            if (c == '.') {
    
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
    
            return res * sgn;
        }
    
        public char nextChar() {
    
            int c = read();
    
            while (isSpaceChar(c))
                c = read();
    
            return (char)c;
        }
    
        public String next() {
    
            int c = read();
    
            while (isSpaceChar(c))
                c = read();
    
            StringBuilder res = new StringBuilder();
    
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));
    
            return res.toString();
        }
    
        public boolean isSpaceChar(int c) {
    
            if (filter != null)
                return filter.isSpaceChar(c);
    
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    
    }
    public static void main(String args[]){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter w = new PrintWriter(outputStream);
        int n,k,i,c=0,temp;
      	n=in.nextInt();
      int arr[]=new int[n];
      int io[]=new int[n];
      //int co[]=new int[n];
      for(i=0;i<n;i++){
        arr[i]=in.nextInt();
        io[arr[i]-1]=++c;
        //arr[i][1]=++c;
      }
      //Arrays.sort(arr);
      /*for(i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(arr[i][0]>arr[j][0]){
            temp=arr[i][0];
            arr[i][0]=arr[j][0];
            arr[j][0]=temp;
            
            temp=arr[i][1];
            arr[i][1]=arr[j][1];
            arr[j][1]=temp;
          }
        }
      }*/
      for(i=0;i<n;i++){
        System.out.print(io[i] +" ");
      }
          
        w.close();
    }
}