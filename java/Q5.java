public class Q5 {
    public static void main(String args[]) {
    /*
        6.하나의 정수(0~99)를 2진수로 변환해서 출력하는 코드를 작성해보자
        (단, 배우지 않은 것들을 사용하지 않고 만들어보고 범위 내의 어떤 숫자를 넣어도 코드를 바꾸지 않고 출력되야 합니다.)
        ex)변수의 값 5 -> 101 출력
        ex)변수의 값 33 -> 100001 출력
        hint) '/' 와 '%' 연산자를 사용해야합니다.
        */

        // 수정 필요
        int num5 = 6;
        int binary = 0;
        int quo = 0;

        while (quo != 1) {
            quo = num5 / 2;
            binary = num5 % 2;
            num5 = quo;
            System.out.print(binary);
        }

        System.out.println(quo);
    }
}