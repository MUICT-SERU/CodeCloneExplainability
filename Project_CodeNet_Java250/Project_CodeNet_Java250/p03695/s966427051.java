import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] in = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] color = {true, true, true, true, true, true, true, true};
        for(int i = 0; i < in.length; i++) {
            list.add(Integer.parseInt(in[i]));
        }
        int count = 0;
        int min = 0;
        int max = 0;
        for(int j = 0; j < list.size(); j++) {
            if(list.get(j) < 400 && color[0]){
                color[0] = false;
                count++;
            } else if(list.get(j) >= 400 && list.get(j) < 800 && color[1]) {
                color[1] = false;
                count++;
            } else if(list.get(j) >= 800 && list.get(j) < 1200 && color[2]) {
                color[2] = false;
                count++;
            } else if(list.get(j) >= 1200 && list.get(j) < 1600 && color[3]) {
                color[3] = false;
                count++;
            } else if(list.get(j) >= 1600 && list.get(j) < 2000 && color[4]) {
                color[4] = false;
                count++;
            } else if(list.get(j) >= 2000 && list.get(j) < 2400 && color[5]) {
                color[5] = false;
                count++;
            } else if(list.get(j) >= 2400 && list.get(j) < 2800 && color[6]) {
                color[6] = false;
                count++;
            } else if(list.get(j) >= 2800 && list.get(j) < 3200 && color[7]) {
                color[7] = false;
                count++;
            } else if(list.get(j) >= 3200) {
                max++;
            }
        }
        max = max + count;
        min = count;
        if(min == 0) {
            min++;
        }
        System.out.println(min + " " + max);
    }
}