package codeWars.kyu8;

public class StringUtils {

    public static String toAlternativeString(String string) {

//          return string.chars()
//                .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
/////////////////////////////////////////////////////////////////////////////////////////////////////
//          return Arrays.stream(string.split(""))
//                 .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
//                 .collect(Collectors.joining(""));
//  }
////////////////////////////////////////////////////////////////////////////////////////////////////

        char c[] = string.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (Character.isLowerCase(c[i])) {
                c[i] = Character.toUpperCase(c[i]);
            } else
                if (Character.isUpperCase(c[i])) {
                c[i] = Character.toLowerCase(c[i]);
            }
        }
        return String.valueOf(c);
    }
}
