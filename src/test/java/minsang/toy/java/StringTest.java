package minsang.toy.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTest {

    @Test
    void test() {
        assertTrue("".equals(""));
        var testString = "test";
        var testString2= "test";
        assertTrue(testString==testString2);
    }
}