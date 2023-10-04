import java.util.Scanner;

public class Main{
  static int n;
  static int[] a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    int[] count = new int[9];
    for(int i = 0; i < n; i++){
      if(a[i] < 400){
        count[0]++;
      }
      else if(a[i] < 800){
        count[1]++;
      }
      else if(a[i] < 1200){
        count[2]++;
      }
      else if(a[i] < 1600){
        count[3]++;
      }
      else if(a[i] < 2000){
        count[4]++;
      }
      else if(a[i] < 2400){
        count[5]++;
      }
      else if(a[i] < 2800){
        count[6]++;
      }
      else if(a[i] < 3200){
        count[7]++;
      }
      else{
        count[8]++;
      }
    }

    int min = 0;
    for(int i = 0; i < 8; i++){
      if(count[i] > 0){
        ++min;
      }
    }

    if(count[8] == 0){
      System.out.println(min + " " + min);
      return;
    }

    int max = min + count[8];
    min = Math.max(min, 1);

    System.out.println(min + " " + max);
  }
}
