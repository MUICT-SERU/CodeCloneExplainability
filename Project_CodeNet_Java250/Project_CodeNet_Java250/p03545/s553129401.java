import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        String s = fs.next();
        int A = Character.getNumericValue(s.charAt(0));
        int B = Character.getNumericValue(s.charAt(1));
        int C = Character.getNumericValue(s.charAt(2));
        int D = Character.getNumericValue(s.charAt(3));
        String op1 = "";
        String op2 = "";
        String op3 = "";

        boolean flag = true;
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                for (int k = 0; k < 2; ++k) {
                    int sum = A;
                    if (i == 0) { sum += B; op1 = "+"; }
                    else { sum -= B; op1 = "-"; }
                    if (j == 0) { sum += C; op2 = "+"; }
                    else { sum -= C; op2 = "-"; }
                    if (k == 0) { sum += D; op3 = "+"; }
                    else { sum -= D; op3 = "-"; }
                    if (sum == 7) {
                        System.out.println(A + op1 + B + op2 + C + op3 + D + "=" + 7);
                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }
            if (!flag) break;
        }
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() { return Double.parseDouble(next());}
}


