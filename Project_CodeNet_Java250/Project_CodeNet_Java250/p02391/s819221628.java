import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
       //????????¬?????°?????????????????????????????????
     Scanner reader = new Scanner(System.in);
     
     //???????????????????????\?????????????¬??????°???????????°???????´?
     int a = reader.nextInt();
     int b = reader.nextInt();
     reader.close();

    //a??????b?????°????????§????????´???  
    if(a<b){
        System.out.println("a < b");
    }
    //b??????a?????°????????§????????´???
    else if (a>b){
         System.out.println("a > b");
     }
     //a??¨b?????°?????????????????´???
    else if(a==b){
         System.out.println("a == b");
     }
    }
}