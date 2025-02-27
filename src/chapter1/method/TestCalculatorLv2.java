package chapter1.method;

public class TestCalculatorLv2 {
    int plus (int a, int b) {
        int result = a + b;
        System.out.println("더하기 결과: " + result);
        return result;
    }
    int minus (int a, int b) {
        int result = a - b;
        System.out.println("빼기 결과: " + result);
        return result;
    }
    int multiply (int a, int b) {
        int result = a * b;
        System.out.println("곱하기 결과: " + result);
        return result;
    }
    int divide (int a, int b) {
        int result = a / b;
        if (b == 0) {
            System.out.println("잘못된 입력입니다.");
        }
        System.out.println("나누기 결과: " + result);
        return result;
    }
}
