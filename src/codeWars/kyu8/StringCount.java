package codeWars.kyu8;

public class StringCount {
    public static int strCount(String str, char letter) {
        int count = 0;
        char[] string = str.toCharArray();

        for (int i = 0; i < string.length; i++) {
            if (string[i] == letter) {
                count++;
            }
        }
        return count;

//        Best Practices
//        return (int)str.chars().filter(x -> x == letter).count();
    }
}