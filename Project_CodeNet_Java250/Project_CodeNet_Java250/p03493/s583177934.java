import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String n = s.next();

        int count = 0;
        for (String c : n.split("")) {
          if (c.equals("1")) {
            count++;
          }
        }

        System.out.println(count);
    }
}