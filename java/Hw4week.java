import java.util.Scanner;

public class Hw4week {
    public static void main(String[] args) {
         /*
        1. 1부터 100사이의 정수 중에서 3 또는 4의 배수가 아닌 수들의 합을 계산하는 프로그램을 작성하라.
         */
        int plus = 0;

        for (int a1 = 1; a1 <= 100; a1++) {
            if ((a1 % 3 != 0) && (a1 % 4 != 0)) {
                plus += a1;
            }
        }
        System.out.println(plus);

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

        /*
        3. *을 출력하여 다음과 같은 문양을 그려보자.
            *
           **
          ***
         ****
        *****
         */
        for (int a3 = 1; a3 <= 5; a3++) {
            for (int b2 = 1; b2 <= 5-a3; b2++) {
                System.out.print(" ");
            }
            for (int c2 = 1; c2 <= a3; c2++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        /*
        4. 사용자가 0을 입력할 때까지 숫자를 더하는 프로그램을 작성하라. (do-while문 활용)
         */
        int result = 0;

        do {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            result += num;

            if (num == 0) {
                System.out.println(result);
                break;
            }
        } while (true);


        /*
         5. 2와 100 사이에 있는 모든 소수를 찾는 프로그램을 작성하라.
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