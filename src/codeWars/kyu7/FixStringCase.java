package codeWars.kyu7;

public class FixStringCase {
    public static String solve(final String str) {
        int countUpperCase = 0;
        int countLowerCase = 0;

        char[] arr = str.toCharArray();

        for (char c : arr) {
            if (Character.isUpperCase(c)) {
                countUpperCase++;
            } else countLowerCase++;
        }
        return countLowerCase >= countUpperCase ? str.toLowerCase() : str.toUpperCase(); //your code here
    }

//     return str.chars().filter(Character::isLowerCase).count() >= str.chars().filter(Character::isUpperCase).count()
//        ? str.toLowerCase()
//        : str.toUpperCase();
}
