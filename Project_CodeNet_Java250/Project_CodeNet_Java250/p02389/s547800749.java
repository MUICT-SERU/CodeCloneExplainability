import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        
        int area = a * b;
        int areaLength = ( a + b ) * 2;

        System.out.println(area + " " + areaLength);
    }
}