import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    long a, b, r, tmp,a1,b1,bai;
    while(scan.hasNextLong()){

    a = scan.nextInt();
    b = scan.nextInt();
    a1 = a;
    b1 = b;
 
    //?????¶??° a > b ????¢?????????\??? 
    if(a<b){
    tmp = a;
    a = b;
    b = tmp;
    }
 
  // ?????????????????????????????? 
    r = a % b;
     while(r!=0){
     a = b;
     b = r;
     r = a % b;
  }
    bai = a1 * b1 / b;
  //* ?????§??¬?´???°????????? */
    System.out.println(b + " " + bai);
    }
    }
}