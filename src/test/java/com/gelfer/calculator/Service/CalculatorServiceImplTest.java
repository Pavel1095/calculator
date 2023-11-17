package com.gelfer.calculator.Service;

import com.gelfer.calculator.exception.DivideException;
import com.gelfer.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class CalculatorServiceImplTest {

    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private int num1 = 5;
    private int num2 = 2;
    @Test
    void plus_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {


        long result = calculatorService.plus(num1, num2);

        assertEquals(num1 + num2, result);
    }
    @Test
    void plus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerThenNum1() {
        int num2 = -8;

        long result = calculatorService.plus(num1, num2);

        assertEquals(num1 + num2, result);
    }

    @Test
    void minus_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {

        long result = calculatorService.minus(num1, num2);

        assertEquals(num1 - num2, result);
    }

    @Test
    void minus_shouldReturnPositiveNumWhenNum1IsPositiveAndNum2IsNegative() {
        int num2 = -5;

        long result = calculatorService.minus(num1, num2);

        assertEquals(num1 - num2, result);
    }

    @Test
    void divide_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {
        int num2 = 5;

        double result = calculatorService.divide(num1, num2);

        assertEquals((double) num1 / num2, result);
    }

    @Test
    void divide_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegative() {
        int num2 = -5;

        double result = calculatorService.divide(num1, num2);

        assertEquals((double) num1 / num2, result);
    }

    @Test
    void divide_shouldThrowExceptionWhenNum2Is0() {
        int num2 = 0;

        DivideException result = assertThrows(DivideException.class,
                () -> calculatorService.divide(num1, num2));
        assertEquals("Деление на 0 не доступно", result.getMessage());
    }

    @Test
    void multiply_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {

        long result = calculatorService.multiply(num1, num2);

        assertEquals(num1 * num2, result);
    }

    @Test
    void multiply_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegative() {
        int num2 = -5;

        long result = calculatorService.multiply(num1,num2);

        assertEquals(num1 * num2, result);
    }
}