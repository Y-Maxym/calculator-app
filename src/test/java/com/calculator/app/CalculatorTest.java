package com.calculator.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @DisplayName("Test addition functionality")
    @CsvSource({
            "10, 5, 15",
            "1, 0, 1",
            "-100, -100, -200",
            "3_211_222, 6_934_222, 10_145_444"
    })
    void givenTwoNumbers_whenAdditionFunctionality_thenCorrectResult(int a, int b, int expected) {
        //given

        //when
        int actual = calculator.addition(a, b);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("Test subtraction functionality")
    @CsvSource({
            "10, 5, 5",
            "1, 0, 1",
            "-100, -100, 0",
            "3_211_222, 6_934_222, -3_723_000"
    })
    void givenTwoNumbers_whenSubtractionFunctionality_thenCorrectResult(int a, int b, int expected) {
        //given

        //when
        int actual = calculator.subtraction(a, b);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("Test multiplication functionality")
    @CsvSource({
            "10, 5, 50",
            "1, 0, 0",
            "-100, -100, 10_000",
            "12394, 13223, 163_885_862"
    })
    void givenTwoNumbers_whenMultiplicationFunctionality_thenCorrectResult(int a, int b, int expected) {
        //given

        //when
        int actual = calculator.multiplication(a, b);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("Test division functionality")
    @CsvSource({
            "10, 5, 2",
            "1, 1, 1",
            "-100, -2, 50",
            "163_885_862, 13223, 12394"
    })
    void givenTwoNumbers_whenDivisionFunctionality_thenCorrectResult(int a, int b, int expected) {
        //given

        //when
        double actual = calculator.division(a, b);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("Test division by zero functionality")
    @CsvSource({
            "10, 0",
            "0, 0",
            "-100, 0",
            "163_885_862, 0"
    })
    void givenZero_whenDivisionFunctionality_thenExceptionThrown(int a, int b) {
        //given

        //when
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.division(a, b));

        //then
        assertEquals(exception.getMessage(), "Division by zero");
    }
}