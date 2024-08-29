package calculator.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setMain() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addition functionality")
    void givenTwoNumbers_whenAdditionFunctionality_thenCorrectResult() {
        //given
        Integer a = 10;
        Integer b = 5;
        Integer expected = 15;

        //when
        Integer actual = calculator.addition(a, b);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test subtraction functionality")
    void givenTwoNumbers_whenSubtractionFunctionality_thenCorrectResult() {
        //given
        Integer a = 10;
        Integer b = 5;
        Integer expected = 5;

        //when
        Integer actual = calculator.subtraction(a, b);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test multiplication functionality")
    void givenTwoNumbers_whenMultiplicationFunctionality_thenCorrectResult() {
        //given
        Integer a = 10;
        Integer b = 5;
        Integer expected = 50;

        //when
        Integer actual = calculator.multiplication(a, b);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test division functionality")
    void givenTwoNumbers_whenDivisionFunctionality_thenCorrectResult() {
        //given
        Integer a = 10;
        Integer b = 5;
        Double expected = 2.0;

        //when
        Double actual = calculator.division(a, b);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test division by zero functionality")
    void givenZero_whenDivisionFunctionality_thenExceptionThrown() {
        //given
        Integer a = 10;
        Integer b = 0;

        //when
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.division(a, b));

        //then
        assertEquals(exception.getMessage(), "Division by zero");
    }
}