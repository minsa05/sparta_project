package chapter2.interitance;

public class Child extends Parent {

    public String famliyName = "gygim";

    public Child() {
        super();
        System.out.println("자식 생성자");
    }

    public void superTest() {
        System.out.println(super.famliyName);
    }

    public void showSocialMedia() {
        System.out.println("SNS에서 우리 가문을 소개드립니다.");
    }

    @Override
    public void introduceFamily() {
        System.out.println("오버라이드");
    }


}
