package codeWars.kyu7;

import java.util.Arrays;
import java.util.stream.Stream;

public class FruitGuy{
    public static String[] removeRotten(String[] fruitBasket) {

        if (fruitBasket == null) {
            return new String[0];
        } else {
            for (int i = 0; i < fruitBasket.length; i++) {
                    fruitBasket[i] = fruitBasket[i].replaceAll("rotten", "").toLowerCase();
            }
        }
        return fruitBasket;
    }
}
