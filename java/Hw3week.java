import java.util.Scanner;

public class Hw3week {
    public static void main(String[] args) {
        /*
        거리를 입력받아 그에 맞는 값을 출력하는 코드를 작성.
        */

        Scanner sc4 = new Scanner(System.in);

        int distance = sc4.nextInt();

        if ( distance >= 0 && distance < 100) {
            System.out.println("5.0");
        }
        else if ( distance >= 101 && distance < 500) {
            System.out.println("8.0");
        }
        else if ( distance >= 501 && distance < 1000) {
            System.out.println("10.0");
        }
        else {
            System.out.println("12.0");
        }

        /*
        사용자가 입력한 값이 1, 2,... , 9이면 "ONE","TWO",... , "NINE"와 같이 출력하는 프로그램을 작성하라.
        1부터 9사이가 아니면 "OTHER"를 출력한다.
         */

        Scanner sc1 = new Scanner(System.in);

        int n1;

        n1 = sc1.nextInt();

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
        /*
        사용자로부터 키를 입력 받아서 표준 체중을 계산한 후에 사용자의 체중과 비교하여 저체중인지, 표준인지,
        과체중인지를 판단하는 프로그램을 작성하라. 표준 체중 계산식은 다음을 사용하라.

        표준체중 = ( 키 - 100 ) x 0.9
        */

        Scanner sc2 = new Scanner(System.in);

        double height;
        double weight;

        height = sc2.nextInt();
        weight = sc2.nextInt();

        double standard = ((height - 100) * 0.9);

        System.out.println("표준 체중:" + standard);

        if (standard > weight) {
            System.out.println("저체중");
        }
        else if (standard == weight) {
            System.out.println("표준 체중");
        }
        else {
            System.out.println("과체중");
        }

        /*
        3개의 숫자를 입력 받아서, 가장 큰 수를 출력하는 코드를 작성하라.
         */

        Scanner sc3 = new Scanner(System.in);

        int a;
        int b;
        int c;

        a = sc3.nextInt();
        b = sc3.nextInt();
        c = sc3.nextInt();

        if (a > b || a > c) {
            System.out.println(a);
        }
        else if (c > b) {

            System.out.println(c);
        }
        else {
            System.out.println(b);
        }
    }
}
