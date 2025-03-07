package chapter3.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        // 배열의 한계
        // 선언과 동시에 길이를 설정 필요
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // 배열의 정적인 특징의 한계
//        number[3] = 40; // 요소 추과시 에러발생

        // 컬렉션
        // 객체<다둘 데이터 : 정수> 변수이름 = new 컬렉션객체생성자<정수>();
        ArrayList<Integer> arrayList = new ArrayList<Integer> ();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40); // 정상 동작 (길이 제한 없음)

        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();

        // 데이터 추가
        names.add("Spartan");
        names.add("Steve");
        names.add("Isac");
        names.add("1");
        names.add("2");
        System.out.println("names = " + names);

        // 중복 데이터 허용
        names.add("Spartan");
        System.out.println("names = " + names);

        // 데이터 단건 조회
        String name1 = names.get(0);
        System.out.println("name1 = " + name1);

        // 데이터 삭제
        names.remove("Steve");
        System.out.println("names = " + names);

        // HashSet 사용 방법
        HashSet<String> uniqueNames = new HashSet<>();

        // 데이터 추가
        uniqueNames.add("Spartan");
        uniqueNames.add("Steve");
        uniqueNames.add("Isac");
        uniqueNames.add("1");
        uniqueNames.add("2");

        // 순서를 보장 안함
        System.out.println("uniqueNames = " + uniqueNames);
        // get() 활용불가
//        uniqueNames.get();

        // 중복 데이터 불가
        uniqueNames.add("Spartan");

        // 데이터 제거
        uniqueNames.remove("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        // HashMap 활용
        // <키("), 값(0)> -> 저장
        HashMap<String, Integer> memberMap = new HashMap<>();

        // 데이터 추가
        memberMap.put("Spartan", 15);
        memberMap.put("Steve", 15);
        memberMap.put("Isac", 1);
        memberMap.put("John", 2);
        memberMap.put("Alice", 3);

        // 순서 보장 X
        System.out.println("memberMap = " + memberMap);

        // 키 중복 불가: 값이 덮어쓰기 발생
        memberMap.put("Alice", 5);
        System.out.println("memberMap = " + memberMap);

        // 단건 조회
        Integer SpartanNum = memberMap.get("Spartan");
        System.out.println("SpartanNum = " + SpartanNum);

        // 삭제
        memberMap.remove("Spartan");
        System.out.println("memberMap = " + memberMap);

        // 키확인
        Set<String> ketSet = memberMap.keySet();
        System.out.println("ketSet = " + ketSet);

        // 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);
    }
}
