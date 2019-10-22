import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        System.out.print("일수를 알고 싶은 월을 입력하시오: ");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int days;

        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;    // 고의적으로 break문을 생략해 여러 가지의 경우를 동일한 문장으로 처리함
            default:
                days = 31;
                break;
        }
        System.out.println(month + "월의 날수는 " + days + "일");
    }
}
