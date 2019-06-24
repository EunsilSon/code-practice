public class Hw4_Q2 {
    public static void main(String[] args) {
        /*
        2. 수식 1 + ( 1 + 2 ) + ( 1 + 2 + 3 ) + ... + ( 1 + 2 + 3 + ... + 1 0 0 )을 계산하는 프로그램을 작성하라.
         */
        int a2 = 0;
        int c1 = 0;

        for (int b1 = 1; b1 <= 100; b1++) {
            a2 += b1;
            c1 += a2;
        }
        System.out.println(c1);

    }
}
