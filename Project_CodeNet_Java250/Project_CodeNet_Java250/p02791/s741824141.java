import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] p = new int[n];
		int smallest = 200001;
		int counter = 0;
		for(int i =0;i<n;i++) {
			p[i] = sc.nextInt();
			if(p[i]<=smallest) {
				counter++;
				smallest  =p[i];
			}
		}
		System.out.println(counter);

	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
