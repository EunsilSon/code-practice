/*
1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성해보자.
 */
public class Chap5_5_1 {
    public static void main(String[] args) {
        int sum = 1;

        for (int num = 1; num <= 10; num++) {
            sum *= num;
        }
        System.out.println("1부터 10까지의 곱의 결과: " + sum);
    }
}