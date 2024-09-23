package edgeOfTheOcean;

import dad.codesignal.edgeOfTheOcean.adjacentElementsProduct;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class adjacentElementsProductTest {
    private adjacentElementsProduct check;

    @Before
    public void setup() { check = new adjacentElementsProduct();}

    @Test
    public void test1() {
        assertEquals(21, check.solution(new int[]{3, 6, -2, -5, 7, 3}));
    }

    @Test
    public void test2() {
        assertEquals(21, check.solution(new int[]{3, 6, -2, -5, 7, 3}));
    }

    @Test
    public void test3() {
        assertEquals(6, check.solution(new int[]{5, 1, 2, 3, 1, 4}));
    }

    @Test
    public void test4() {
        assertEquals(6, check.solution(new int[]{1, 2, 3, 0}));
    }

    @Test
    public void test5() {
        assertEquals(50, check.solution(new int[]{9, 5, 10, 2, 24, -1, -48}));
    }

    @Test
    public void test6() {
        assertEquals(30, check.solution(new int[]{5, 6, -4, 2, 3, 2, -23}));
    }

    @Test
    public void test7() {
        assertEquals(6, check.solution(new int[]{4, 1, 2, 3, 1, 5}));
    }

    @Test
    public void test8() {
        assertEquals(-12, check.solution(new int[]{-23, 4, -3, 8, -12}));
    }

    @Test
    public void test9() {
        assertEquals(0, check.solution(new int[]{1, 0, 1, 0, 1000}));
    }


}
