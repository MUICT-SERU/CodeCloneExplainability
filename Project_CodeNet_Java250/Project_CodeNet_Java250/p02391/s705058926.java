import java.io.*;
class Main{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String array[] = str.split(" ");
		
		 int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		
		if(x > y){
			System.out.println("a" + " > "+ "b");
		}
			else if(x == y){
				System.out.println("a" + " == " +"b");
				}
				else if(x < y){
					System.out.println("a" + " < " +"b");
					}
					}
					}
					