import java.util.Scanner;

public class Hw3_Q2 {
    public static void main(String[] args) {
        /*
        사용자가 입력한 값이 1, 2,... , 9이면 "ONE","TWO",... , "NINE"와 같이 출력하는 프로그램을 작성하라.
        1부터 9사이가 아니면 "OTHER"를 출력한다.
         */

        Scanner sc2 = new Scanner(System.in);

        int n1 = sc2.nextInt();

        switch (n1) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
        }
    }
}
