package com.fpt.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.fpt.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //chuẩn bị bộ data x! kì vọng bằng mấy
    //Chính là mảng 2 chiều
    //Hàm này phải là static để các hàm test mò vào lấy data để test run
    public static Object[][] initData() {
        return new Object[][] {
                { 0, 1 },
                { 1, 1 },
                { 2, 2 },
                { 3, 6 },
                { 4, 24 },
                { 5, 120 },
                { 6, 720 },
        };
    }
    @ParameterizedTest
    @MethodSource("initData") //DDT - Data Driven Testing 

    public void testFactorialGivenRightAgrumentReturnsWell(int n, long expectedResult)
    {
        assertEquals(expectedResult, getFactorial(n));
    }
}