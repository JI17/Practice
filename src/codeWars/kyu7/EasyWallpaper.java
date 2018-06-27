package codeWars.kyu7;

public class EasyWallpaper {

    public String wallpaper(double l, double w, double h) {

        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        String s = "";

        if (l != 0 && w != 0 && h != 0) {
            s = strings[(int) Math.ceil(2 * h * (l + w) / 0.52 / 10 * 1.15)];
        } else s = strings[0];

        return s;
    }
}

