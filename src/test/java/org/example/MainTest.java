package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPalindrome() {
        assertTrue(Main.isPalindrome("Was it a car or a cat I saw"));
        assertTrue(Main.isPalindrome("adwwda"));
        assertTrue(Main.isPalindrome("123321"));
    }
    @Test
    void quadraticEq()
    {
        assertEquals("There are no real roots", Main.quadraticEq(4, 0, 1));
        assertEquals("Roots: x1=-8.0 x2=-8.0", Main.quadraticEq(4, 4, 1));
    }

    @Test
    void strReverse() {
        assertEquals("llatsni ekam", Main.strReverse("make install"));
    }
    @Test
    void seriesSum()
    {
        assertEquals(0.6101121094474383, Main.seriesSum());
    }
    @Test
    void sequence() {
        int n = 4;
        List<String> sequence = Main.sequence(n);
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        assertEquals(expected, sequence);
        n = 5;
        expected.add("fizz");
        assertEquals(expected, Main.sequence(n));
    }

    @Test
    void sequenceNegativeSize() {
        int n = -2;
        List<String> sequence = Main.sequence(n);

        assertNull(sequence);
    }
}