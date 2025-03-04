package chapter1.method;

import java.util.Scanner;

public class TestMethodLv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestCalculatorLv2 calculator = new TestCalculatorLv2();

        while (true) {
            System.out.println("현재 저장된 연산 결과: " + calculator.getResult());
            System.out.println(" 계산기 프로그램 ");
            // 연산 입력
            System.out.print("첫 번째 숫자를 입력해주세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력해주세요: ");
            int b = sc.nextInt();
            // 연산자 선택
            System.out.println("1  +  더하기");
            System.out.println("2  -  빼기");
            System.out.println("3  *  곱하기");
            System.out.println("4  /  나누기");
            System.out.print("연산 기호 또는 숫자를 입력하세요: ");

            String operator = sc.next();
            int result = 0;

            // 연산 기호에 따른 계산
            switch (operator) {
                case "1":
                case "+":
                    result = calculator.plus(a, b);
                    break;
                case "2":
                case "-":
                    result = calculator.minus(a, b);
                    break;
                case "3":
                case "*":
                    result = calculator.multiply(a, b);
                    break;
                case "4":
                case "/":
                    if (b == 0) {
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                    } else {
                        result = calculator.divide(a, b);
                    }
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;
            }

            //연산 결과
            System.out.println("연산 결과: " + result);

            // 저장된 연산
            System.out.println("저장된 연산결과: " + calculator.getResult());

            // 저장된 연산 결과 제거 여부
            System.out.println("마지막 저장된 결과를 제거하시겠습니까? (yes 입력시 삭제)");
            String answer = sc.next();
            if (answer.equals("yes")) {
                calculator.removeResult();
                System.out.println("결과 삭제 후: " + calculator.getResult());
            }

            // 반복 여부
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            answer = sc.next();
            if (answer.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}