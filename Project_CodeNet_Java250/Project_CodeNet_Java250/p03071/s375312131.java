import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b){
            System.out.println(2*a - 1);
        }
      else if(a == b){
      		System.out.println(2*a);
      }
        else{
            System.out.println(2*b - 1);
        }
    }
}
