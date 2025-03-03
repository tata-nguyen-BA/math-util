package com.fpt.mathutil.core;

import org.junit.jupiter.api.Test;

//import static là cách khai báo trước tên class chứ hàm static
//để bên dưới gọi hàm static ngắn gọn như bên pascal, C : gọi hàm không cần dấu chấm tên class
//nếu có nhiều hàm static, thì ta chỉ cần import static tên class.*

import static com.fpt.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    // class này sài bộ thư viện junit được tải qua maven trên mạng về tự đọng bới maven.
    // bộ thư viện này dùng để test tự động các hàm của class chính
    // nó sẽ tự chạy kkhi đóng gói app, để check xem các hàm có chạy đúng không
    // đúng tức expected == actual
    // nếu có nhiều testcase thì nó sẽ gom status của các testcase lại thanhf 2 màu xanh đỏ, mắt dân dev chỉ cần nhìn xem xanh hay đỏ
    // bộ thư viện này còn gọi là framework

    //Test case #1: verify getfactorial with n = 0 expected result 0! = 1
    @Test
    public void testFactorialGivenRightAgrumentOReturnsWell()
    {
        int n = 0;
        long expectedResult = 1;
        long actualResult = getFactorial(n);
        //System.out.println("Expected: " + expectedResult + " vs.Actual: " + actualResult);
        //System.out.println(expectedResult == actualResult);
        assertEquals(expectedResult, actualResult);
        //so sánh xem expected == actual không? nhưng k cần viết sout()
        //hàm này là của class thư viện junit
    }
    //Test case #2
    @Test
    public void testFactorialGivenRightAgrument1ReturnsWell()
    {
        assertEquals(1, getFactorial(1));
    }
    //Test case #3
    @Test
    public void testFactorialGivenRightAgrument4ReturnsWell()
    {
        assertEquals(24, getFactorial(4));
    }
    //Test case #4
    @Test
    public void testFactorialGivenRightAgrument5ReturnsWell()
    {
        assertEquals(120, getFactorial(5));
    }

}