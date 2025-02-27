package chapter1.method;

import java.util.Scanner;

public class TestMethodLv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestCalculatorLv2 calculator = new TestCalculatorLv2();

        while (true) {
            System.out.println(" 계산기 프로그램 ");
            System.out.print("첫 번째 숫자를 입력해주세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력해주세요: ");
            int b = sc.nextInt();

            System.out.println("1  +  더하기");
            System.out.println("2  -  빼기");
            System.out.println("3  *  곱하기");
            System.out.println("4  /  나누기");
            System.out.print("연산 기호 또는 숫자를 입력하세요: ");

            String operator = sc.next();


            switch (operator) {
                case "1":
                case "+":
                    calculator.plus(a, b);
                    break;
                case "2":
                case "-":
                    calculator.minus(a, b);
                    break;
                case "3":
                case "*":
                    calculator.multiply(a, b);
                    break;
                case "4":
                case "/":
                    if (b == 0) {
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                    } else {
                        calculator.divide(a, b);
                    }
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String answer = sc.next();
            if (answer.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}