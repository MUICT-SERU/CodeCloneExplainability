import java .util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int useDays = 0;
	for (int i=0; i<M; i++) {
	    useDays += sc.nextInt();
	}
	if (useDays > N) System.out.print(-1);
	else { System.out.print(N-useDays); }
    }
}
