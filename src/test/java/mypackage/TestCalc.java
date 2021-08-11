package mypackage;

import org.junit.jupiter.api.Test;
import static
        org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    private final MyCalc calc = new MyCalc();
    @Test
    void testAdd() {
        assertEquals(calc.add(5, 5), 10, "Addition works!");
    }
    @Test
    void testSubtract() {
        assertEquals(calc.subtract(15, 5), 10);
    }
}