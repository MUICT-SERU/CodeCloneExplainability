import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    ArrayList<String> list = new ArrayList<String>();
    String str1;
    int count = 0;
    for(int i=0;i<str.length();i++){
      list.add(str.substring(i,i+1));
    }
    for(int i=0;i<list.size();i++){
      count = 0;
      str1 = list.get(i);
      for(int m=0;m<list.size();m++){
        if(list.get(m).equals(str1)){
          count++;
        }
      }
      if(count%2==1){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}