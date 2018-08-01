package codeWars.kyu7;

public class OddEvenSort {
    public static String sortMyString(String s) {
        String even = "";
        String odd = "";

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || i % 2 == 0) {
                even += s.charAt(i);
            } else odd += s.charAt(i);
        }
        return even+" "+ odd;
    }
}
