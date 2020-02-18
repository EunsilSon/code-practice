/*
자연수 1부터 시작해서 모든 홀수를 더해 나간다. 그리고 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지,
그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자.
 */
public class Chap5_6_2 {
    public static void main(String[] args) {
        int odd = 1;
        int result = 0;

        while (true) {
            if ((odd % 2) != 0) {
                result += odd;
            }
            if (result > 1000) {
                System.out.println(odd + "을 더했을 때 1000을 넘어섰음" + "\n" + "1000을 넘어선 값: " + result);
                break;
            }
            odd++;
        }
    }
}