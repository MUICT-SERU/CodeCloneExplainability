import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int Aloc = s.length();
        int Zloc = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                if (i < Aloc)
                    Aloc = i;
            }

            if (s.charAt(i) == 'Z') {
                if (i > Zloc)
                    Zloc = i;
            }


        }

        System.out.println(Zloc - Aloc + 1);




    }


}
