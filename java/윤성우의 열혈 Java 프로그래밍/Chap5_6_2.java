/*
자연수 1부터 시작해서 모드느 홀수를 더해 나간다. 그리고 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지,
그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자.
 */
public class Chap5_6_2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (true) {
            if ((num % 2) != 0) {
                sum += num;
            }
            if (sum > 1000) {
                System.out.println(num + "을 더했을 때 1000을 넘어섰음" + "\n" + "1000을 넘어선 값: " + sum);
                break;
            }
            num++;
        }
    }
}