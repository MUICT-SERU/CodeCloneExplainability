import java.io.*;
import java.util.*;


public class Main implements Runnable {

  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = scanner.nextInt();
    int result = 0;
    for (int ai = 0 ; ai <= a ; ai ++) {
      for (int bi = 0 ; bi <= b ; bi ++) {
        int rest = x - 500 * ai - 100 * bi;
        if (rest >= 0 && rest / 50 <= c) {
          result ++;
        }
      }
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }

  // scanner slightly faster than usual ones
  public static class BetterScanner {

    private InputStream stream;
    private byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufferLength = 0;

    public BetterScanner(InputStream stream) {
      this.stream = stream;
    }

    private boolean updateBuffer() {
      if (pointer >= bufferLength) {
        pointer = 0;
        try {
          bufferLength = stream.read(buffer);
        } catch (IOException exception) {
          exception.printStackTrace();
        }
        return bufferLength > 0;
      } else {
        return true;
      }
    }

    private int read() {
      if (updateBuffer()) {
        return buffer[pointer ++];
      } else {
        return -1;
      }
    }

    public boolean hasNext() {
      skipUnprintable();
      return updateBuffer();
    }

    private void skipUnprintable() { 
      while (updateBuffer() && !isPrintableChar(buffer[pointer])) {
        pointer ++;
      }
    }

    public String next() {
      if (hasNext()) {
        StringBuilder builder = new StringBuilder();
        int codePoint = read();
        while (isPrintableChar(codePoint)) {
          builder.appendCodePoint(codePoint);
          codePoint = read();
        }
        return builder.toString();
      } else {
        throw new NoSuchElementException();
      }
    }

    public long nextLong() {
      if (hasNext()) {
        long number = 0;
        boolean minus = false;
        int codePoint = read();
        if (codePoint == '-') {
          minus = true;
          codePoint = read();
        }
        if (codePoint >= '0' && codePoint <= '9') {
          while (true) {
            if (codePoint >= '0' && codePoint <= '9') {
              number *= 10;
              number += codePoint - '0';
            } else if (codePoint < 0 || !isPrintableChar(codePoint)) {
              return (minus) ? -number : number;
            } else {
              throw new NumberFormatException();
            }
            codePoint = read();
          }
        } else {
          throw new NumberFormatException();
        }
      } else {
        throw new NoSuchElementException();
      }
    }

    public int nextInt() {
      long number = nextLong();
      if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
        return (int)number;
      } else {
        throw new NumberFormatException();
      }
    }

    private boolean isPrintableChar(int codePoint) {
      return codePoint >= 33 && codePoint <= 126;
    }

  }

}