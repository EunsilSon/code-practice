public class Hw1week {
    public static void main(String arg[]) {
        /*
        1. 자바의 정수형 변수 중 정수형 변수들의 종류와 크기(바이트 단위)를 모두 적어주세요.
         byte: 1바이트, short: 2바이트, int: 4바이트, long: 8바이트
        */

        /*
        2. 정수형 변수 A, B, C 를 만들어 A 와 B 에 아무 정수 값을 주고 A 와 B 를 더한값을 C 에 준 후 A, B, C 변수를 하나의 출력문에 사용해 "[A의값] + [B의값] = [C의 값]" 을 출력해주세요.
        ex) A 가 '5' B 가 '8' 일때 C의 값은 13 이 되며 "5 + 8 = 13" 이 출력
        */
            int a = 3;
            int b = 4;
            int c = a + b;

            System.out.println(c);

        /*
        3. 정수형 변수 세 개를 만들어 각각의 값에 7, 8, 15 를 정해주고 세 수의 합의 5배의 값을 출력하는 코드를 작성해주세요.
        (단, '*' 연산자를 사용해야합니다.)
        */
            int a1 = 7;
            int b1 = 8;
            int c1 = 15;

            int num = ((a1 + b1 + c1) * 5);

            System.out.println(num);

        /*
        4. 상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다.
        영수증에서는 10% 부가세와 잔돈 등이 나온다고 하자.
        구입한 상품의 가격과 손님한테 받은 금액을 정하면 부가세와 잔돈을 출력하는 코드를 작성해 보세요.
        ex) 받은 돈 10000 상품의 가격 7500 이라고하면 -> "부가세: 750 잔돈: 2500" 출력
        */
            int product = 5000;
            int money = 8000;
            int surtax = product / 10;
            int charge = money - product;

            System.out.println("부가세: " + surtax + " 잔돈: " + charge);

        /*
        5. 세자리(100~999) 변수 하나를 만들고 그 수의 각 자리수의 합을 출력하는 코드를 작성해주세요.
        (단, N의 숫자를 바꿔도 원하는 값이 나와야 합니다.)
        ex) N = 267 일때 15 출력
        ex2) N = 575 일때 17 출력
        */

            int number = 123;
            int num1 = 0;
            int num2 = 0;

            num1 = number / 10;
            num2 = num1 / 10;

            int num3 = num1 % 10;
            int num4 = number % 10;

            System.out.println(num4 + num2 + num3);

//----------이 문제는 어려우면 안풀어도 되는 문제입니다. 풀어보고 싶은사람만 풀어보세요.----------//

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
