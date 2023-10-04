import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String line, str;
    int m, h;
    while(true){
      line = br.readLine();
      if (line.equals("-")) {break;}
      m = Integer.parseInt(br.readLine());
      for (int i = 0; i < m; i++){
        h = Integer.parseInt(br.readLine());
        str = line.substring(0,h);
        line = line.substring(h, line.length()) + str;
      }
    sb.append(line).append("\n");
    }
    System.out.print(sb);
  }
}