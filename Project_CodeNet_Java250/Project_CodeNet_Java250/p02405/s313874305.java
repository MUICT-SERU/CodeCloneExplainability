import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  
    label:
    while(sc.hasNextLine()){
      int h = sc.nextInt();
      int w = sc.nextInt();
        
      if(h==0 && w==0) break label;
      for(int i = 1; i<=h; i++){
        for(int j = 1; j<=w; j++){
          if(i %2 != 0){             //?\???°???
            if(j % 2 != 0){
             System.out.print("#");
            }else{
              System.out.print(".");
            }
          }else if(i % 2 == 0){      //??¶??°???
            if(j % 2 != 0){
             System.out.print(".");
            }else{
              System.out.print("#");
            }
          }
        }
System.out.println("");
      }
System.out.println("");
    }
      
  }
}
