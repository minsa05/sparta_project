package chapter2.calzz;

public class Main {
    public static void main(String[] args) {
        // 객체 생성(인스턴스 화)
        Person personA = new Person("gygim", 20);
        Person personB = new Person("steve", 15);

        // 속성에 직접 접근
//        System.out.println("설정 전 personA이름: " + personA.name);
//        System.out.println("설정 전 personB이름: " + personA.name);
//        personA.name = "gygim";
//        personB.name = "steve";
//        System.out.println("설정 후 personA이름: " + personA.name);
//        System.out.println("설정 후 personB이름: " + personB.name);

        // 기능 활용
        int result1 = personA.sum(1,2);
        int result2 = personA.sum(3,4);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // 게터 활용
        String name = personA.getName();
        System.out.println("name = " + name);

        // 세터 활용
        System.out.println("personA의 주소: " + personA.address);
        personA.setAddress("서울");
        System.out.println("personA의 주소:" + personA.address);
    }
}
