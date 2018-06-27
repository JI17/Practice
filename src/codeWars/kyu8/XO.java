package codeWars.kyu8;

public class XO {

    public static boolean getXO(String str) {

        char string[] = str.toLowerCase().toCharArray();
        boolean b = false;
        char x = 'x';
        char o = 'o';
        int countX = 0;
        int countO = 0;

        for (char ch : string) {
            if (ch == x) {
                countX ++;
            }if (ch == o) {
                countO ++;
            }
        }
        if (countX == countO) {
            b = true;
        }

        return b;

//        Best Practices
//        return str.toUpperCase().replace("X", "").length() == str.toUpperCase().replace("O", "").length();
    }
}