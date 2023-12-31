import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	/**
	 * AOJ001 List of Top 3 Hills
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> mountainList = getMountainList();

		Collections.sort(mountainList);
		Collections.reverse(mountainList);

		for (int i = 0; i < 3; i++) {
			System.out.println(mountainList.get(i));
		}
	}

	/**
	 * ??\??????????????¨??????10???????±±????????????????´???????????????????????????´??????
	 *
	 * @return 10???????±±????????????????´???????????????????
	 * @throws IOException ??\????????¨??????
	 */
	private static ArrayList<Integer> getMountainList() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		ArrayList<Integer> mountainList = new ArrayList<Integer>();

		String strInput;
		for (int i = 0; i < 10; i++) {
			strInput = bufferedReader.readLine();
			mountainList.add(Integer.parseInt(strInput));
		}

		bufferedReader.close();
		return mountainList;
	}

}