import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int i=1;
	
	while(true){
		int x = i;
		if(x%3==0 || x%10==3 || (x/10)%10==3 || (x/100)%10==3|| (x/1000)%10==3){
			System.out.print(" "+x);
		}
		i++;
		if(i>n){
			break;
		}}	
	System.out.println();
}}