package codeWars.kyu7;

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        String s = "";

        for (int i = 0; i < binary.size(); i++) {
            s += binary.get(i);
        }
       return Integer.parseInt(s,2);
    }
}

// public static int ConvertBinaryArrayToInt(List<Integer> binary) {
//        return binary.stream().reduce((x, y) -> x * 2 + y).get();
//    }