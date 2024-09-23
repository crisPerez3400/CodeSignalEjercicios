package thejourneybegins;

import dad.codesignal.thejourneybegins.Add;
import dad.codesignal.thejourneybegins.CheckPalindrome;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckPalindromeTest {
    private CheckPalindrome check;

    @Before
    public void setup() {
        check = new CheckPalindrome();
    }

    @Test
    public void test1() {
        assertEquals(true, check.solution("aabaa"));
    }

    @Test
    public void test2() {
        assertEquals(false, check.solution("abac"));
    }

    @Test
    public void test3() {
        assertEquals(true, check.solution("a"));

    }

    @Test
    public void test4() {
        assertEquals(false, check.solution("az"));

    }

    @Test
    public void test5() {
        assertEquals(true, check.solution("abacaba"));

    }

    @Test
    public void test6() {
        assertEquals(true, check.solution("z"));

    }

    @Test
    public void test7() {
        assertEquals(false, check.solution("aaabaaaa"));

    }

    @Test
    public void test8() {
        assertEquals(false, check.solution("zzzazzazz"));

    }

    @Test
    public void test9() {
        assertEquals(true, check.solution("hlbeeykoqqqqokyeeblh"));

    }

    @Test
    public void test10() {
        assertEquals(true, check.solution("hlbeeykoqqqokyeeblh"));

    }
}
