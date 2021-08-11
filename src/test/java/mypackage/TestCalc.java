package mypackage;

import org.junit.jupiter.api.Test;
import static
        org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    private final MyCalc calc = new MyCalc();
    @Test
    void testAdd() {
        assertEquals(calc.add(4, 5), 10, "Addition works!");
    }
}