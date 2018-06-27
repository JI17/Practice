package codeWars.testCodeWars;

import codeWars.kyu8.StringCount;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCountTest {

    @Test
    public void testSomething() {
        assertEquals(StringCount.strCount("Hello", 'o'),1);
        assertEquals(StringCount.strCount("Hello", 'l'),2);
        assertEquals(StringCount.strCount("",'z'),0);
    }

}