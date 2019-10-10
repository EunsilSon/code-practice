import java.util.Scanner;

public class If_statement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num == 1) {
            System.out.println("숫자 1에서 7까지 입력: " + num + "\n" + "오늘은 월요일 입니다");
        } else if (num == 2) {
            System.out.println("숫자 1에서 7까지 입력: " + num + "\n" + "오늘은 화요일 입니다");
        } else if (num == 3) {
            System.out.println("숫자 1에서 7까지 입력: " + num + "\n" + "오늘은 수요일 입니다");
        } else if (num == 4) {
            System.out.println("숫자 1에서 7까지 입력: " + num + "\n" + "오늘은 목요일 입니다");
        } else if (num == 5) {
            System.out.println("숫자 1에서 7까지 입력: " + num + "\n" + "오늘은 금요일 입니다");
        } else if (num == 6) {
            System.out.println("숫자 1에서 7까지 입력: " + num + "\n" + "오늘은 토요일 입니다");
        } else if (num == 7) {
            System.out.println("숫자 1에서 7까지 입력: " + num + "\n" + "오늘은 일요일 입니다");
        } else {
            System.out.println("숫자 1에서 7까지 입력: " + num + "\n" + "잘 못 입력된 요일 입니다");
        }
    }
}