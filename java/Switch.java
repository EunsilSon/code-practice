import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String days;

        while (true) {
            System.out.println("1~7의 값을 입력하세요: ");
            int num1 = input.nextInt();

            switch (num1) {
                case 1:
                    days = "월";
                    break;
                case 2:
                    days = "화";
                    break;
                case 3:
                    days = "수";
                    break;
                case 4:
                    days = "목";
                    break;
                case 5:
                    days = "금";
                    break;
                case 6:
                    days = "토";
                    break;
                case 7:
                    days = "일";
                    break;
                default:
                    days = "잘못된";
                    break;
            }
            System.out.println("선택 한 요일은 " + days + "요일 입니다.");
            break;
        }
    }
}