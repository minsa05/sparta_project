package chapter1.test;

public class TestArray {
    public static void main(String[] args) {
        int [] arr = {3, 4, 7, 10, 15, 20};

        System.out.print("짝수: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
