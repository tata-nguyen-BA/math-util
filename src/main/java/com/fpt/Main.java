package com.fpt;

import com.fpt.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightAgrumentOReturnsWell();
        testFactorialGivenRightAgrument1ReturnsWell();
        testFactorialGivenRightAgrument5ReturnsWell();
        testFactorialGivenWrongAgrumentMinus1ThrowsException();
    }
    public static void testFactorialGivenWrongAgrumentMinus1ThrowsException()
    {
        MathUtility.getFactorial( -1);
        //chạy hàm này thấy ngoại lệ thì đúng
    }
        //hàm kiểm thử code chính dùng để test code chính
        //Tên hàm kiểm thử viết dài mang luôn ý nghĩa của testcase
        public static void testFactorialGivenRightAgrumentOReturnsWell()
        {
            int n = 0;
            long expectedResult = 1;
            long actualResult = MathUtility.getFactorial(n);
            System.out.println("Expected: " + expectedResult + " vs.Actual: " + actualResult);
            System.out.println(expectedResult == actualResult);
        }
    public static void testFactorialGivenRightAgrument1ReturnsWell()
    {
        int n = 1;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);
        System.out.println("Expected: " + expectedResult + " vs.Actual: " + actualResult);
        System.out.println(expectedResult == actualResult);
    }
    public static void testFactorialGivenRightAgrument5ReturnsWell()
    {
        int n = 5;
        long expectedResult = 120;
        long actualResult = MathUtility.getFactorial(n);
        System.out.println("Expected: " + expectedResult + " vs.Actual: " + actualResult);
        System.out.println(expectedResult == actualResult);
    }


        //dân dev test code như thế nào?
        //trước khi test cần có test case
        //testcase #1
        //(1) Given N =0;
        //(2) Call getfactorial(0);
        //Expected result/value:0;

        //testcase #2
        //(1) Given N =1;
        //(2) Call getfactorial(1);
        //Expected result/value:1;

        //testcase #3
        //(1) Given N =2;
        //(2) Call getfactorial(2);
        //Expected result/value:2;

        //testcase #4
        //check getfactorial() with n = -1
        //Steps:
        //(1) Given N = -1;
        //(2) Call getfactorial(-1);
        //Expected result/value:an exception is thrown;

        //testcase #5
        //check getfactorial() with n = 21
        //Steps:
        //(1) Given N = 21;
        //(2) Call getfactorial(21);
        //Expected result/value:an exception is thrown;

    }
