package com.systechafrica.part4.functionalprogramming;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.function.Supplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = (a, b, numbers) -> {
        int sum = a + b;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    };

    Divider divider = (a, b) -> a / b;

    @Test
    @DisplayName("Test calculation using calculate method")
    void testSum() {
        // data
        int a = 7;
        int b = 7;

        // int[] numbers = {};

        // expeted result
        // int expected = 14;

        // then calculate
        // int actual = calculator.calculate(a, b, numbers);

        // verify

        // Supplier<String> messageSupplier = () -> "Expected result should be " + expected;


        // ? Lambda functions during testing


        // Assertions.assertEquals(expected, actual, messageSupplier);
        Assertions.assertAll(
                () -> assertEquals(14, calculator.calculate(7, 7), "Expected result should be match"),
                () -> assertEquals(-10, calculator.calculate(-5, -5), "Expected result should be match"),
                () -> assertEquals(20, calculator.calculate(7, 3, 5, 4, 1), "Expected result should be match")
        );
    }


    @Test
    @DisplayName("Test calculation using divide method")
    void testDivide() {
        assertAll(
                () -> assertEquals(2, divider.divide(10, 5), "Expected result should be match"),
                () -> assertEquals(5, divider.divide(-20, -4), "Expected result should be match"),
                () -> assertThrows(ArithmeticException.class, () -> divider.divide(20, 0))
   
        );
    }


}
