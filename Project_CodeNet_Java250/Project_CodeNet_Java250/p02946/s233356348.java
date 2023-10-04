// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // long N = sc.nextLong();
        // long K = sc.nextLong();
        int K = sc.nextInt();
        int X = sc.nextInt();

        StringJoiner sj = new StringJoiner(" ");

        for (int i = -(K - 1); i < K; i++) {
            sj.add(String.valueOf(i + X));
        }

        System.out.println(sj.toString());

    }
}