import java.util.Scanner;

public class circle_area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("반지름을 입력하시오.");
        double radius = input.nextDouble();

        System.out.println(3.14 * (radius * radius));
    }
}