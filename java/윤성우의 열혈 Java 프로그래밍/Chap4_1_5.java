/*
변수 n1, n2, n3가 다음과 같을 때 n1 > n2 > n3이면 true, 아니면 false를 출력하는 프로그램을 작성해보자.

n1 = {(25 + 5) + (36 / 4) - 72 } * 5
n2 = {(25 x 5) + (36 - 4) + 71 } / 4
n3 = (128 / 4) x 2
 */
public class Chap4_1_5 {
    public static void main(String[] args) {
        int n1, n2, n3;
        boolean result;

        n1 = ((25 + 5) + (36 / 4) - 72 ) * 5;
        n2 = ((25 * 5) + (36 - 4) + 71 ) / 4;
        n3 = (128 / 4) * 2;

        result = ((n1 > n2) && (n2 > n3));

        System.out.println(result);
    }
}
