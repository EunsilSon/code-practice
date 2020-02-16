public class For_Q1 {
    public static void main(String[] args) {
        /*
        1부터 100사이의 정수 중에서 3 또는 4의 배수가 아닌 수들의 합을 계산하는 프로그램을 작성하라.
         */
        int plus = 0;

        for (int a1 = 1; a1 <= 100; a1++) {
            if ((a1 % 3 != 0) && (a1 % 4 != 0)) {
                plus += a1;
            }
        }
        System.out.println(plus);

    }
}
