package codeWars.kyu7;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] arrStr = str.toCharArray();

        for (char w : arrStr) {
            if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
// return str.replaceAll("(?i)[^aeiou]", "").length();

// return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();