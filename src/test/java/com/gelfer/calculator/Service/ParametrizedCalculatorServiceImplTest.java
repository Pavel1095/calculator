package com.gelfer.calculator.Service;

import com.gelfer.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParametrizedCalculatorServiceImplTest {

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();


    @ParameterizedTest
    @MethodSource("provideNums")

    void plus(int num1, int num2) {
        long result = calculatorService.plus(num1, num2);

        System.out.println(result);

        assertEquals((long) num1 + num2, result);
    }

    @Test
    void minus() {
    }

    @Test
    void divide() {
    }

    @Test
    void multiply() {
    }

    private static Stream<Arguments> provideNums(){
        return Stream.of(
                Arguments.of(5, 4),
                Arguments.of(5, -4),
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
}