public class For_Q5 {
    public static void main(String[] args) {
        /*
         2와 100 사이에 있는 모든 소수를 찾는 프로그램을 작성하라.
         (소수 공식: 주어진 정수 k를 2부터 k-1까지의 숫자로 나누어서 나머지가 0인 것이 하나라도 있으면 소수가 아니다.)
         */

        for (int k = 2; k <= 100; k++) {
            boolean check = true;
            int range = k - 1;

            for (int i = 2; i < range; i++) {
                if (k % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("소수: " + k);
            }
        }
    }
}
