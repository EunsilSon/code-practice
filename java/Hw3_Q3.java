import java.util.Scanner;

public class Hw3_Q3 {
    public static void main(String[] args) {
        /*
        사용자로부터 키를 입력 받아서 표준 체중을 계산한 후에 사용자의 체중과 비교하여 저체중인지, 표준인지,
        과체중인지를 판단하는 프로그램을 작성하라. 표준 체중 계산식은 다음을 사용하라.

        표준체중 = ( 키 - 100 ) x 0.9
        */

        Scanner sc3 = new Scanner(System.in);

        double height = sc3.nextInt();
        double weight = sc3.nextInt();

        double standard = ((height - 100) * 0.9);

        System.out.println("표준 체중:" + standard);

        if (standard > weight) {
            System.out.println("저체중");
        } else if (standard == weight) {
            System.out.println("표준 체중");
        } else {
            System.out.println("과체중");
        }
    }
}
