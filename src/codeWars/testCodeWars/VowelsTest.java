package codeWars.testCodeWars;

import codeWars.kyu7.Vowels;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        Assert.assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}