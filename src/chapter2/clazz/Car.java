package chapter2.clazz;

public class Car {
    // 1. 속성
    String name;
    String carModel;

    // 2. 생성자
    public Car(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;
    }

    // 3. 기능
public void drive() {
    System.out.println(name + "[" + carModel + "] 을 주행합니다.");
    }
}
