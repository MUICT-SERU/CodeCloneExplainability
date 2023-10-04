
import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int verticalLine = Integer.parseInt(br.readLine());//???????????¬??°
			int horizontalLine = Integer.parseInt(br.readLine());//?¨?????????°
			List<Integer> lots = new ArrayList<>();//?????????????´????????????????
			
			for(int i=0; i<verticalLine; i++){
				lots.add(i+1);//???????????????????????????????????????????????? ex) ???????????°??????1??????????????????[1], 2??????????????????[2]...
			}
			
			for(int j=1; j<horizontalLine+1; j++){
				String line = br.readLine();
				String[] dataSet = line.split(",");
				
				lots = swap(lots, Integer.parseInt(dataSet[0]), Integer.parseInt(dataSet[1]));
			}
			
			for(int k=0; k<lots.size(); k++){
				System.out.println(lots.get(k));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * ???????????\????????????????????????
	 * @param ??????????????????????´???????????????????
	 * @param ??\????????????????????????????????????
	 * @param ??\????????????????????????????????????
	 *
	 */
	private static List<Integer> swap(List<Integer> lots, int index1, int index2) {
		int tmp = lots.get(index1-1);
		lots.set(index1-1, lots.get(index2-1));
	    lots.set(index2-1, tmp);
	    return lots;
	}
}