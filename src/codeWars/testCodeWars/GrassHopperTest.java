package codeWars.testCodeWars;

import static org.junit.Assert.assertEquals;

import codeWars.kyu8.GrassHopper;
import org.junit.Assert;
import org.junit.Test;

public class GrassHopperTest {
    @Test
    public void test1() {
        Assert.assertEquals(1,
                GrassHopper.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                GrassHopper.summation(8));
    }
}