package codeWars.kyu7;

import java.util.List;

public class Rotations {

    public static Boolean containAllRots(String strng, List<String> arr) {
        for (int i = 0; i < strng.length(); i++)
            if (!arr.contains(strng.substring(i, strng.length()) + strng.substring(0, i)))
                return false;
        return true;
    }
}



