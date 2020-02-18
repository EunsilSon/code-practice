/*
인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드와 원의 둘레를 계산해서 반환하는 메소드를 각각 정의하고,
이 둘을 호출하는 main 메소드를 정의하자.
 */
public class Chap6_2_1 {
    public static void main(String[] args) {
        System.out.println("원의 넓이: " + area(5.5));    //메소드 area 호출과 동시에 반환 값 저장
        System.out.println("원의 둘레: " + circum(5.5));    // 메소드 circumference 호출과 동시에 반환 값 저장
    }

    static double area(double radios) {    // 메소드 area
        return radios * radios * 3.14;    // 원의 넓이 연산
    }

    static double circum(double radios) {    //메소드 circumference
        return radios * 2 * 3.14;    // 원의 둘레 연산
    }
}