import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] str = line.split(" ");
        String[] num = sc.nextLine().split(" ");
        String strU = sc.nextLine();

        String strS = str[0];
        String strT = str[1];

        int numA = Integer.parseInt(num[0]);
        int numB = Integer.parseInt(num[1]);

        if(strU.equals(strS)) {
        	numA -= 1;
        }else {
        	numB -= 1;
        }

        System.out.println(numA+" "+numB);

	}

}
