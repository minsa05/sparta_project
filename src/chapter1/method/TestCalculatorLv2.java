package chapter1.method;

public class TestCalculatorLv2 {

    private int result;


    public int plus(int a, int b) {
        result = a + b;
        return result;
    }

    public int minus(int a, int b) {
        result = a - b;
        return result;
    }

    public int multiply(int a, int b) {
        result = a * b;
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("잘못된 입력입니다.");
            return 0;
        }
        result = a / b;
        return result;
    }

    public int getResult() {
        return result;
    }

    public void removeResult() {
        result = 0;
        System.out.println("결과가 초기화되었습니다.");
    }

    public void saveResult() {
    }
}
