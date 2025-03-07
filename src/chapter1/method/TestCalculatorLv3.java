package chapter1.method;

public class TestCalculatorLv3 {

    private int result;

    public enum OperatorType {
        plus,
        minus,
        multiply,
        divide
    }


        // 연산 기호에 따른 계산하고 값을 리턴
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




    // 결과값 가져오기
    public int getResult() {
        return result;
    }

    // 결과 삭제
    public void removeResult() {
        result = 0;
        System.out.println("결과가 초기화되었습니다.");
    }
}
