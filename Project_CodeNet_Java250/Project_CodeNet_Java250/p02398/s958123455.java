import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();

		int x = Integer.parseInt(SubStringStart(str));//?¬¬????????°
		int y = Integer.parseInt(SubStringMid(str));//?¬¬????????°
		int z = Integer.parseInt(SubStringEnd(str));//?¬¬????????°

//		Integer[] div1 = getDivisor(x);
//		Integer[] div2 = getDivisor(y);
		Integer[] div3 = getDivisor(z);

		Set<Integer> set = new HashSet<>();

		for (int i = x; i <= y; i++) {
//			System.out.println("?????°="+i);
			if (Arrays.asList(div3).contains(i)) {
				set.add(i);
			}
		}
//		for (int i = 0; i < div2.length; i++) {
//			if (Arrays.asList(div3).contains(div2[i])) {
//				set.add(div2[i]);
//			}
//		}

		System.out.println(set.size());
	}

	//?¬¬????????°???????????????????????????
	public static String SubStringStart(String str) {
		int index = str.indexOf(" ");
		return (str.substring(0, index));
	}

	//	?¬¬????????°???????????????????????????
	public static String SubStringEnd(String str) {
		int index = str.lastIndexOf(" ");
		return (str.substring(index + 1));
	}

	//	?¬¬????????°???????????????????????????
	public static String SubStringMid(String str) {
		int index1 = str.indexOf(" ");
		int index2 = str.lastIndexOf(" ");
		return (str.substring(index1 + 1, index2));
	}

	//?????°????´???°???????????????????????????
	public static Integer[] getDivisor(int num) {
		int dnum = getDnum(num);
		Integer[] getNum = new Integer[dnum];
		int dflag = 0;
		for (int i = 1; i < num + 1; i++) {
			if (num % i == 0) {
				getNum[dflag] = i;
				dflag++;
			}
		}
		return (getNum);
	}

	//?´???°?????°???????????????????????????
	public static int getDnum(int num) {
		int dflag = 0;

		for (int i = 1; i < num + 1; i++) {
			if (num % i == 0) {
				dflag++;
			}
		}
		return (dflag);
	}
}