/*
다음 계산 결과를 출력하는 프로그램을 작성하되, 덧셈 연산의 횟수를 최소화하여 작성해보자.
3 + 6
3 + 6 + 9
3 + 6 + 9 + 12
 */
public class Chap4_1_4 {
    public static void main(String[] args) {
        int n1, n2, n3;

        n1 = 3 + 6;
        n2 = n1 + 9;
        n3 = n2 + 12;

        System.out.println("3+6 = " + n1);
        System.out.println("3+6+9 = " + n2);
        System.out.println("3+6+9+12 = " + n3);
    }
}
