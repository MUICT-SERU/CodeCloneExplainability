import java.util.Scanner;

public class Main {

public static void main(String[] args) {

 Scanner in = new Scanner(System.in);
 int A = in.nextInt();
 int B = in.nextInt();
 int C = in.nextInt();
 int D = in.nextInt();

 int start = Math.max(A, C);
 int end = Math.min(B, D);

 if((A <= start)&&(start <= B)&&(C <= start)&&(start <= D)&&(A <= end)&&(end <= B)&&(C <= end)&&(end <= D)){
    System.out.println(end - start);
 }
 else{
	 System.out.println("0");
 }

 in.close();
}
}