import java.util.Scanner;

public class Hw2week {
    public static void main(String[] args) {
        /*
        문자형 변수는 정수형으로, 정수형 변수는 문자형 으로 바꾸시오.
        ex) A => 65 , 66 => B
         */

        char a = '해' ;
        System.out.println((int)a);

        char b = '커' ;
        System.out.println((int)b);

        char c = '즈' ;
        System.out.println((int)c);

        char d = '랩' ;
        System.out.println((int)d);

        int a1 = 76 ;
        System.out.println((char)a1);

        int b1 = 79 ;
        System.out.println((char)b1);

        int c1 = 86 ;
        System.out.println((char)c1);

        int d1 = 69 ;
        System.out.println((char)d1);

        /*
        가로, 세로, 높이를 입력받아 직육면체의 밑면의 넓이, 부피, 겉넓이를 구하는 프로그램을 작성하시오.
         */
        int height = 10;
        int width = 2;
        int length = 3;

        int area = (width * length);
        int side = ((width * height * 2) + (length * height * 2));

        System.out.println("직육면체의 밑면의 넓이: " + area);
        System.out.println("직육면체의 부피: " + (area * height));
        System.out.println("직육면체의 겉넓이: " + (area * 2 + side));

        /*
        m(미터)를 입력 받아 ft(피트)로 변환하는 프로그램을 작성하시오. ( 1ft = 0.304m )
        */
        Scanner scan = new Scanner(System.in);

        double ft;
        int m;

        m = scan.nextInt();

        ft = m * 3.28084;

        System.out.println(ft);

        /*
        성적들을 입력 받아 평균 등급을 계산하는 프로그램을 작성하여 제시되는 출력 형태가 되게 만드시오.
        국어: 3, 수학: 4, 영어: 2, 한국사: 1, 탐구1: 3, 탐구2: 3, 평균 등급: 2.67
        */
        float kor = 3;
        float mat = 4;
        float eng = 2;
        float his = 1;
        float sub1 = 3;
        float sub2 = 3;

        System.out.println("평균 등급: " + ((kor + mat + eng + his + sub1 + sub2) / 6));
    }
}
