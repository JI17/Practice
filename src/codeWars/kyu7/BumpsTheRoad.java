package codeWars.kyu7;

import java.util.Arrays;

public class BumpsTheRoad {
    public static String bumps(final String road) {

        return Arrays.stream(road.split(""))
                .filter(s -> s.equals("n"))
                .count() <= 15 ? "Woohoo!" : "Car Dead";
    }
}
