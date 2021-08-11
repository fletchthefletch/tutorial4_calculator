package mypackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {
    void setUp() {
        MyCalc mycalc = new MyCalc();
    }
    @Test
    void testAdd() {
        Assert.assertEquals(mycalc.add(4, 5), 9, "Addition works!");
    }
}