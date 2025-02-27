package chapter2.interitance.abstractexmaple;

public class Main {
    public static void main(String[] args) {
        //  추상클래스는 인스턴스화 할 수 없습니다.
//        Ainmal ainmal = new Animal();
        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();
        // 자식에서 강제 구현된 메서드
        cat.eat();
    }
}
