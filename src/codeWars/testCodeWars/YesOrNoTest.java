package codeWars.testCodeWars;

import codeWars.kyu8.YesOrNo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        Assert.assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }

}