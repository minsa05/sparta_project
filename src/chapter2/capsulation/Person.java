package chapter2.capsulation;

public class Person {

    // 속성
    private String name;
    private String secret;

    // 생성자
    public Person(String name) {
        this.name = name;
    }

    // 기능
    public void methodA() {}
    public void methodB() {}

    // 게터
    public String getName() {
        return name;
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }
}
