package codeWars.testCodeWars;

import codeWars.kyu8.Positive;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class PositiveTest {
    @Test
    public void testSomething() {
        Assert.assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
    }
}
