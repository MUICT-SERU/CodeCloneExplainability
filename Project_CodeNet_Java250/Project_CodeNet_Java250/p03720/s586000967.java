
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		// map
		Map<Integer, Integer> mapCityAndRoad = new HashMap<Integer,Integer>();
		
		Scanner sc = new Scanner(System.in);
		int numCity = sc.nextInt();
		int numRoad = sc.nextInt();
		
		for(int i=1;i<=numCity;i++){
			
			mapCityAndRoad.put(i, 0);
		}
		
		for(int i=0;i<numRoad*2;i++){
			
			int tmpCity = sc.nextInt();
			int tmpNumRoad = (int)mapCityAndRoad.get(tmpCity);
			mapCityAndRoad.put(tmpCity, tmpNumRoad+1);
		}

		for(int i=1;i<=numCity;i++){
			
			System.out.println(mapCityAndRoad.get(i));
		}
		return;
	}
}