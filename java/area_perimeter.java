import java.util.*;

public class area_perimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("사각형의 가로를 입력하시오.");
        double w = input.nextDouble();

        System.out.println("사각형의 세로를 입력하시오.");
        double h = input.nextDouble();

        double area = w * h;
        double perimeter = 2 * (w + h);

        System.out.println("직사각형의 넓이는 " + area);
        System.out.println("직사각형의 둘레는 " + perimeter);
    }
}