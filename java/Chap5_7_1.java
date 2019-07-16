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