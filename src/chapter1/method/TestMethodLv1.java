package chapter1.method;

import java.util.Scanner;

public class TestMethodLv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("계산기 프로그램입니다.");
            System.out.println("원하는 계산을 입력해주세요.");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.print("선택 해주세요 (1~4) 사이: ");

            int number = scanner.nextInt();

            if (number < 1 || number > 4) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            System.out.print("첫 번째 숫자를 입력해주세요: ");
            int a = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력해주세요: ");
            int b = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("결과: " + (a + b));
                    break;
                case 2:
                    System.out.println("결과: " + (a - b));
                    break;
                case 3:
                    System.out.println("결과: " + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                    } else {
                        System.out.println("결과: " + (a / b));
                    }
                    break;
            }
            System.out.println("더 계산하시겠습니까?");
            String answer = scanner.next();
            if (answer.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}