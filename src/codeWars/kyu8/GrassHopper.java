package codeWars.kyu8;

public class GrassHopper {

    public static int summation(int n) {

//        return n*(1+n)/2;

        int summ = 0;

        for (int i = 0; i <= n; i++) {
            summ += i;
        }

        return summ;
    }
}
