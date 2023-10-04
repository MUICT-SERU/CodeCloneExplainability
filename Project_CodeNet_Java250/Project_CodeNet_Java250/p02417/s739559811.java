import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main{
	public static void main(String[] args){


		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] s_array;
		String s;
		StringBuffer buf=new StringBuffer();

		try{
			while(true){
		s=reader.readLine();
		if(s==null)break;
		buf.append(s);

		}
		s_array=buf.toString().split("");

		Alphabet(s_array);

		}catch(IOException e){
			System.out.println(e);
		}

	}

	//?????????????????????????????§1????????????????????????????????????????????£??\??????

	private static void Alphabet(String[] s_array){

		int[] alp=new int[26];
		Arrays.fill(alp, 0);

		for(int i=0;i<s_array.length;i++){
			s_array[i]=s_array[i].toLowerCase();

			switch(s_array[i]){

			case("a"):
				alp[0]+=1;break;
			case("b"):
				alp[1]+=1;break;
			case("c"):
				alp[2]+=1;break;
			case("d"):
				alp[3]+=1;break;
			case("e"):
				alp[4]+=1;break;
			case("f"):
				alp[5]+=1;break;
			case("g"):
				alp[6]+=1;break;
			case("h"):
				alp[7]+=1;break;
			case("i"):
				alp[8]+=1;break;
			case("j"):
				alp[9]+=1;break;
			case("k"):
				alp[10]+=1;break;
			case("l"):
				alp[11]+=1;break;
			case("m"):
				alp[12]+=1;break;
			case("n"):
				alp[13]+=1;break;
			case("o"):
				alp[14]+=1;break;
			case("p"):
				alp[15]+=1;break;
			case("q"):
				alp[16]+=1;break;
			case("r"):
				alp[17]+=1;break;
			case("s"):
				alp[18]+=1;break;
			case("t"):
				alp[19]+=1;break;
			case("u"):
				alp[20]+=1;break;
			case("v"):
				alp[21]+=1;break;
			case("w"):
				alp[22]+=1;break;
			case("x"):
				alp[23]+=1;break;
			case("y"):
				alp[24]+=1;break;
			case("z"):
				alp[25]+=1;break;
			default:break;
			}//switch

		}//for

		System.out.println("a : "+alp[0]);
		System.out.println("b : "+alp[1]);
		System.out.println("c : "+alp[2]);
		System.out.println("d : "+alp[3]);
		System.out.println("e : "+alp[4]);
		System.out.println("f : "+alp[5]);
		System.out.println("g : "+alp[6]);
		System.out.println("h : "+alp[7]);
		System.out.println("i : "+alp[8]);
		System.out.println("j : "+alp[9]);
		System.out.println("k : "+alp[10]);
		System.out.println("l : "+alp[11]);
		System.out.println("m : "+alp[12]);
		System.out.println("n : "+alp[13]);
		System.out.println("o : "+alp[14]);
		System.out.println("p : "+alp[15]);
		System.out.println("q : "+alp[16]);
		System.out.println("r : "+alp[17]);
		System.out.println("s : "+alp[18]);
		System.out.println("t : "+alp[19]);
		System.out.println("u : "+alp[20]);
		System.out.println("v : "+alp[21]);
		System.out.println("w : "+alp[22]);
		System.out.println("x : "+alp[23]);
		System.out.println("y : "+alp[24]);
		System.out.println("z : "+alp[25]);
	}//Alphabet????????????
}