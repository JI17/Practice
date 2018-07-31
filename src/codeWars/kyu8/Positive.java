package codeWars.kyu8;

import java.util.Arrays;

public class Positive {

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(n -> n > 0).sum();
    }

}
