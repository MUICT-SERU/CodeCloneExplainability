import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] a=new int[100];
    	int count=0;
    	for(int i=0;i<100;i++){
    		a[i]=0;
    	}
    	int A=sc.nextInt();
    	int B=sc.nextInt();
    	int C=sc.nextInt();
    	int D=sc.nextInt();
    	for(int i=A;i<B;i++){
    		a[i]++;
    	}
    	for(int i=C;i<D;i++){
    		a[i]++;
    	}
    	for(int i=0;i<100;i++){
    		if(a[i]==2){
    			count++;
    		}
    	}
    	System.out.println(count);
    }
}