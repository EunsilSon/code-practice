/*
구구단 중 5단을 출력하는 프로그램을 for문을 이용해서 작성해보자.
 */
public class Chap5_5_2 {
    public static void main(String[] args) {
        int num = 5;

        for (int sum = 1; sum <= 9; sum++) {
            System.out.println(num + " X " + sum + " = " + (num * sum));
        }
    }
}