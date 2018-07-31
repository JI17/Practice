package codeWars.kyu8;

import java.util.Arrays;

public class SortAndStar {

    public static String twoSort(String[] s) {

        Arrays.sort(s);

        String arrStr = s[0].replaceAll("", "***");

        return arrStr.substring(3, arrStr.length() - 3);

//        return String.join("***",s[0].split(""));

    }
}
