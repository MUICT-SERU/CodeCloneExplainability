import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????


		Scanner scan = new Scanner(System.in);
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();

		Integer[] ary;

		while(scan.hasNext()){

			ary = new Integer[2];
			//???H
			ary[0] = scan.nextInt();
			//?¨?W
			ary[1] = scan.nextInt();

			if(ary[0] != 0 && ary[1] != 0){

				list.add(ary);
			}else{
				scan.close();
				break;
			}

		}

		String[] mark;

		for(int i = 0; i < list.size(); i++){

			ary = list.get(i);
			//???
			for(int j = 0; j < ary[0]; j++){


				//?¨?
				if(j % 2 == 0){
				//?\???°???

					for(int k = 0; k < ary[1]; k++){

						if(k % 2 == 0){
						//?\???°???
							System.out.print("#");
						}else{
						//??¶??°???
							System.out.print(".");
						}
					}
					System.out.println("");

				}else{
				//??¶??°???

					for(int k = 0; k < ary[1]; k++){

						if(k % 2 == 0){
						//?\???°???
							System.out.print(".");
						}else{
						//??¶??°???
							System.out.print("#");
						}
					}
					System.out.println("");
				}


			}
			System.out.println("");
		}
	}
}