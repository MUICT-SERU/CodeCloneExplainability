public class Main {
public static void main(String[] args){
	
	String[] input = new java.util.Scanner ( System.in ). nextLine().split(" ");
	int a = Integer.parseInt(input[0]);
	int b = Integer.parseInt(input[1]);
	int c = Integer.parseInt(input[2]);
	if (a < b && b < c)
		System.out.println("Yes");
	else
		System.out.println("No");
	
	
	
}
}