package codeWars.kyu7;

public class AntiString {
    private static char getComplimentaryChar(char c) {
        return  Character.isLowerCase(c) ?
                Character.toUpperCase((char) (219 - c)) :
                Character.toLowerCase((char) (155 - c));
    }

    public static String antiString(String str) {
        StringBuilder antistr = new StringBuilder();

        for (char ch : str.toCharArray()) {
            antistr.append(Character.isLetter(ch) ? getComplimentaryChar(ch) : "" + (9 - Integer.parseInt("" + ch)));
        }
        return antistr.reverse().toString();
    }
}
//    final static String lookup = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//    final static String pukool = "9876543210zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA";
//
//    public static String antiString(String s){
//        StringBuilder sb = new StringBuilder(s.length());
//        for (char c : s.toCharArray()) {
//            sb.append(pukool.charAt(lookup.indexOf(c)));
//        }
//        return sb.reverse().toString();
//    }