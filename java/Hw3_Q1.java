import java.util.Scanner;

public class Hw3_Q1 {
    public static void main(String[] args) {
        /*
        거리를 입력받아 그에 맞는 값을 출력하는 코드를 작성.
        */

        Scanner sc1 = new Scanner(System.in);

        int distance = sc1.nextInt();

        if (distance >= 0 && distance < 100) {
            System.out.println("5.0");
        } else if (distance < 500) {
            System.out.println("8.0");
        } else if (distance < 1000) {
            System.out.println("10.0");
        } else {
            System.out.println("12.0");
        }
    }
}