package codeWars.kyu7;

public class RowWeights {
    public static int[] rowWeights(final int[] weights) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 != 0) {
                odd += weights[i];
            }
            else even += weights[i];
        }
        return new int[]{even, odd}; // Do your magic!
    }
}
