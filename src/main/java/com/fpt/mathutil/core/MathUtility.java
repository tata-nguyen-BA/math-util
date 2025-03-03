package com.fpt.mathutil.core;

public class MathUtility {
    //hàm tính n!
    //nó là thư viện toán học. Mà thư viện tính toán thì các hàm thường sẽ là static
    //n! = 1.2.3....n, trong đó
    //0! = 1! = 1
    //mình k tính quá 20! vì 21! kiểu long chứ k nỗi, sẽ tính sai
    // mình chỉ tính từ 0...20!
    //hàm nhận vào n, trả về n! (n trong đoạn từ [0..20])
    public static long getFactorial(int n) {
        //kĩ thuật cộng dồn, nhân dồn giá trị
        if  (n < 0 || n >20) {
            throw  new IllegalArgumentException("Invalid n. n must be in the range [0...20]");
        }
        long result = 1; //bài tổng thì ban đầu = 0
        if (n == 0)
            return 1; //thoát sớm khi có thể
        //if và for nếu chỉ có 1 lệnh không cần {}
        //if return sớm thì k cần else
        //n = 1 2 3 4 -> nhân dồn vào result
        for (int i = 1; i <= n; i++) {
            //result  = result * i;
            result *= i; //nhân dồn từ 1 đến n, i tăng từ 1 2 3.., dồn vào result
        }
        return result;
    }
}
