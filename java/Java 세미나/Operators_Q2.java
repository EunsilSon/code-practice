public class Operators_Q2 {
    public static void main(String args[]) {
        /*
        세자리(100~999) 변수 하나를 만들고 그 수의 각 자리수의 합을 출력하는 코드를 작성하라.
        (단, N의 숫자를 바꿔도 원하는 값이 나와야 함.)
        Ex 1) N = 267 일때, 15 출력
           2) N = 575 일때, 17 출력
        */

        int number = 123;
        int num1 = 0;
        int num2 = 0;

        num1 = number / 10;
        num2 = num1 / 10;

        int num3 = num1 % 10;
        int num4 = number % 10;

        System.out.println(num4 + num2 + num3);
    }
}
