import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
 
public class Main {

  static class Reader {

    final private int BUFFER_SIZE = 1 << 16; 
    private DataInputStream din; 
    private byte[] buffer; 
    private int bufferPointer, bytesRead; 

    public Reader() { 
      din = new DataInputStream(System.in); 
      buffer = new byte[BUFFER_SIZE]; 
      bufferPointer = bytesRead = 0; 
    } 

    public Reader(String file_name) throws IOException { 
      din = new DataInputStream(new FileInputStream(file_name)); 
      buffer = new byte[BUFFER_SIZE]; 
      bufferPointer = bytesRead = 0; 
    } 

    public String readLine() throws IOException { 
      byte[] buf = new byte[64]; // line length 
      int cnt = 0, c; 
      while ((c = read()) != -1) { 
        if (c == '\n') 
          break; 
        buf[cnt++] = (byte) c; 
      } 
      return new String(buf, 0, cnt); 
    } 

    public int nextInt() throws IOException { 
      int ret = 0; 
      byte c = read(); 
      while (c <= ' ') 
        c = read(); 
      boolean neg = (c == '-'); 
      if (neg) 
        c = read(); 
      do { 
        ret = ret * 10 + c - '0'; 
      } while ((c = read()) >= '0' && c <= '9'); 

      if (neg) 
        return -ret; 
      return ret; 
    } 

    public long nextLong() throws IOException { 
      long ret = 0; 
      byte c = read(); 
      while (c <= ' ') 
        c = read(); 
      boolean neg = (c == '-'); 
      if (neg) 
        c = read(); 
      do { 
        ret = ret * 10 + c - '0'; 
      } 
      while ((c = read()) >= '0' && c <= '9'); 
      if (neg) 
        return -ret; 
      return ret; 
    } 

    public double nextDouble() throws IOException { 
      double ret = 0, div = 1; 
      byte c = read(); 
      while (c <= ' ') 
        c = read(); 
      boolean neg = (c == '-'); 
      if (neg) 
        c = read(); 

      do { 
        ret = ret * 10 + c - '0'; 
      } 
      while ((c = read()) >= '0' && c <= '9'); 

      if (c == '.') { 
        while ((c = read()) >= '0' && c <= '9') { 
          ret += (c - '0') / (div *= 10); 
        } 
      } 

      if (neg) 
        return -ret; 
      return ret; 
    } 

    private void fillBuffer() throws IOException { 
      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
      if (bytesRead == -1) 
        buffer[0] = -1; 
    } 

    private byte read() throws IOException { 
      if (bufferPointer == bytesRead) 
        fillBuffer(); 
      return buffer[bufferPointer++]; 
    } 

    public void close() throws IOException { 
      if (din == null) 
        return; 
      din.close(); 
    } 
  }

 
  public static void main(String args[]) throws IOException {
    // try {
    //   FileOutputStream output = new FileOutputStream("temp.out");
    //   PrintStream out = new PrintStream(output);
    //   //Diverting the output stream into file "temp.out".Comment the below line to use console
    //   System.setOut(out);
  
    //   InputStream input = new FileInputStream("temp.in");
    //   //Diverting the input stream into file "temp.in".Comment the below line to use console
    //   System.setIn(input);
    
    // } catch (FileNotFoundException e) {
    //   e.printStackTrace();
    // }
  
    // Scanner sc = new Scanner(System.in);
    Reader sc = new Reader();
    // BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter wr = new PrintWriter(System.out);

    // int t = 1;
    // t = sc.nextInt();    //Comment this line if there is single test case
    
    // while((t--) != 0) {




    // }



    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();


    boolean ans = check(k, a, b);
    if(ans) {
        wr.println("OK");
    } else {
      wr.println("NG");
    }

    wr.flush();
    wr.close();
  }

  public static boolean check(int k, int a, int b) {
    
    for(int i = a; i <= b; i++) {
      if(i % k == 0)
        return true;
    }
    return false;
  }
}