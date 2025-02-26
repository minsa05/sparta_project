package chapter1.loop;

import java.util.Scanner;

public class TestLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("출력할 구구단 단수를 입력하세요 (2~9): ");
        int dan = scanner.nextInt();

        if (dan < 2 || dan > 9) {
            System.out.println("2에서 9 사이의 숫자를 입력하세요.");
        } else {
            System.out.println("====" + dan + "단 ====");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + "*" + i + " = " + (dan * i));
            }
        }
    }
}
