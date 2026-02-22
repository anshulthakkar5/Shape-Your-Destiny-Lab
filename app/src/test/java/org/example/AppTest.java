package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(5, App.calculate(2, 3, '+'));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, App.calculate(3, 2, '-'));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, App.calculate(2, 3, '*'));
    }

    @Test
    void testDivision() {
        assertEquals(2, App.calculate(6, 3, '/'));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                App.calculate(5, 0, '/')
        );

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                App.calculate(5, 3, '%')
        );

        assertEquals("Invalid operator", exception.getMessage());
    }
}
