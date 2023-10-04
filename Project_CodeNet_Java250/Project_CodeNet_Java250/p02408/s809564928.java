public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] s, h, c, d;
    int i, a;
    String str;

    n = sc.nextInt();
    s = new int[13];
    h = new int[13];
    c = new int[13];
    d = new int[13];

    for(i = 0;i < n;i++){
      str = sc.next();
      a = sc.nextInt();
      if("S".equals(str)){
        s[a - 1] = 1;
      }else if("H".equals(str)){
        h[a - 1] = 1;
      }else if("C".equals(str)){
        c[a - 1] = 1;
      }else{
        d[a - 1] = 1;
      }
    }

    for(i = 0;i < 13;i++){
      if(s[i] != 1){
        System.out.println("S " + (i + 1));
      }
    }
    for(i = 0;i < 13;i++){
      if(h[i] != 1){
        System.out.println("H " + (i + 1));
      }
    }
    for(i = 0;i < 13;i++){
      if(c[i] != 1){
        System.out.println("C " + (i + 1));
      }
    }
    for(i = 0;i < 13;i++){
      if(d[i] != 1){
        System.out.println("D " + (i + 1));
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

}