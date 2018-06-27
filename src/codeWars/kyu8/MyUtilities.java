package codeWars.kyu8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtilities{

    public boolean isDigit(String s)
    {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
}
