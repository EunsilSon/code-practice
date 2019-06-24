import java.util.Scanner;

public class Hw4_Q4 {
    public static void main(String[] args) {
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
    }
}
