package chapter3.generic;

public class Main {
    public static void main(String[] args) {
        // 1. 재사용 불가
        Box box1 = new Box(100);
//        new Box("ABC");
//        new Box(0.1);

        // 2. 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(100);

        // item 을 활용하기 위해서는 down casting 필요
        Object item = (String) strBox.getItem();
        System.out.println("item = " + item);

//        String item2 = (String) intBox.getItem(); // 정수를 문자열로 캐스팅해서 담아버림

        // 제네릭 활용
        // 1. 재사용성 보장 (타입소거 : T -> Object)
        GenericBox<String> strGBox = new GenericBox<String>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<Integer>(100);
        GenericBox<Double> doubleGBox = new GenericBox<Double>(0.1);

        // 2. 타입 안정성 보장(타입소거: 자동으로 down casting 삽입)
        String steGBOxItem = strGBox.getItem();
        System.out.println("steGBOxItem = " + steGBOxItem);

        Integer intGBoxItem = intGBox.getItem();
        System.out.println("intGBoxItem = " + intGBoxItem);

        Double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("doubleGBoxItem = " + doubleGBoxItem);

        // 일반 메서드(String 기준으로 타입 소거 발생)
        strGBox.printItem("ABC");
//        strGBox.printItem(100);
//        strGBox.printItem(0.1);

        // 제너릭 메서드(String 과 상관 없음)
        strGBox.printBoxItem("ABC");
        strGBox.printBoxItem(100);
        strGBox.printBoxItem("0.1");
    }
}
