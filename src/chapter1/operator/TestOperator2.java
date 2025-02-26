package chapter1.test;

public class TestOperator2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        boolean isGreater = x > y;
        System.out.println("x가 y보다 큰가? " + isGreater);
        boolean isSmaller = x < y;
        System.out.println("x가 y보다 작은가? " + isSmaller);
        boolean isEqual = x == y;
        System.out.println("x와 y가 같은가? " + isEqual);
        boolean isNotEqual = x != y;
        System.out.println("x와 y가 다른가? " + isNotEqual);
    }
}
