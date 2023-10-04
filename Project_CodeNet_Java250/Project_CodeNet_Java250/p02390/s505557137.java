import java.io.*;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            if (0 <= n && n < 86400) {
                int h = n / (60 * 60);
                int x = n % (60 * 60);
                int m = x / 60;
                int s = x % 60;
                System.out.println(h + ":" + m + ":" + s);
            } else {
                System.out.println("error!");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("??°????????¢????????£????????????????????????");
        }
    }
}