import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Set<Integer> answers = new HashSet<>();
        answers.add(1);
        answers.add(2);
        answers.add(3);

        answers.remove(a);
        answers.remove(b);

        System.out.println(answers.toArray()[0]);
    }
}
