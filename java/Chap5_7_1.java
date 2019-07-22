/*
구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을 작성하되, 2단은 2 X 2까지, 4단은 4 X 4까지, 6단은 6 X 6까지, 8단은 8 X 8까지 출력하도록 작성하자.
 */
public class Chap5_7_1 {
    public static void main(String[] args) {
        for (int num = 1; num < 9; num++) {
            for (int sum = 1; sum <= 9; sum++) {
                if ((num % 2) == 0) {
                    System.out.println(num + " X " + sum + " = " + (num * sum));
                    if (num == sum) {
                        break;
                    }
                }
            }
        }
    }
}