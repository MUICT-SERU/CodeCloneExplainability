import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	if((A==1 && B==2)||(A==2 && B==1)) System.out.print(3);
	else if((A==1 && B==3)||(A==3 && B==1)) System.out.print(2);
	else System.out.print(1);
    }
}
