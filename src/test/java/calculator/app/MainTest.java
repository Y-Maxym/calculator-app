package calculator.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static Main main;

    @BeforeAll
    static void setMain() {
        main = new Main();
    }

    @Test
    @DisplayName("Test addition functionality")
    void givenTwoNumbers_whenAdditionFunctionality_thenCorrectResult() {
        //given
        Integer a = 10;
        Integer b = 5;
        Integer expectedResult = 15;
        //when
        Integer obtainedResult = main.addition(a, b);
        //then
        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    @DisplayName("Test subtraction functionality")
    void givenTwoNumbers_whenSubtractionFunctionality_thenCorrectResult() {
        //given
        Integer a = 10;
        Integer b = 5;
        Integer expectedResult = 5;
        //when
        Integer obtainedResult = main.subtraction(a, b);
        //then
        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    @DisplayName("Test multiplication functionality")
    void givenTwoNumbers_whenMultiplicationFunctionality_thenCorrectResult() {
        //given
        Integer a = 10;
        Integer b = 5;
        Integer expectedResult = 50;
        //when
        Integer obtainedResult = main.multiplication(a, b);
        //then
        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    @DisplayName("Test division functionality")
    void givenTwoNumbers_whenDivisionFunctionality_thenCorrectResult() {
        //given
        Integer a = 10;
        Integer b = 5;
        Integer expectedResult = 2;
        //when
        Integer obtainedResult = main.division(a, b);
        //then
        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    @DisplayName("Test division by zero functionality")
    void givenZero_whenDivisionFunctionality_thenExceptionThrown() {
        //given
        Integer a = 10;
        Integer b = 0;
        //when
        //then
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> main.division(a, b));
        assertEquals(exception.getMessage(), "Division by zero");
    }
}