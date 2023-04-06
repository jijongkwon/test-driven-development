package study.chap1;

import org.junit.jupiter.api.Test;
import study.chap1.Dollar;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
    }
}