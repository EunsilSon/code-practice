import java.util.Scanner;

public class If_Q3 {
    public static void main(String[] args) {
        /*
        3개의 숫자를 입력 받아서, 가장 큰 수를 출력하는 코드를 작성하라.
         */

        Scanner sc4 = new Scanner(System.in);

        int a = sc4.nextInt();
        int b = sc4.nextInt();
        int c = sc4.nextInt();

        if (a > b || a > c) {
            System.out.println(a);
        } else if (c > b) {

            System.out.println(c);
        } else {
            System.out.println(b);
        }
    }
}
