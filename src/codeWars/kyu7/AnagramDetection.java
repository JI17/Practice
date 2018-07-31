package codeWars.kyu7;

import java.util.Arrays;

public class AnagramDetection {

    public static boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()) return false;

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++) {
            if(c1[i] == c2[i]) return true;
        }
        return false;
    }
}


//        String sc1 = new String(c1);
//        String sc2 = new String(c2);
//        return sc1.equals(sc2);
//}