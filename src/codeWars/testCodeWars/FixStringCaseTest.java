package codeWars.testCodeWars;
import codeWars.kyu7.FixStringCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FixStringCaseTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("code", FixStringCase.solve("code"));
        assertEquals("CODE", FixStringCase.solve("CODe"));
        assertEquals("code", FixStringCase.solve("COde"));
        assertEquals("code", FixStringCase.solve("Code"));
        assertEquals("", FixStringCase.solve(""));
    }

}
