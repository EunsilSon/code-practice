import java.util.Scanner;

public class Operators_Q5 {
    public static void main(String[] args) {
    /*
        m(미터)를 입력 받아 ft(피트)로 변환하는 프로그램을 작성하시오. ( 1ft = 0.304m )
        */
        Scanner scan = new Scanner(System.in);

        double ft;
        int m;

        m = scan.nextInt();

        ft = m * 3.28084;

        System.out.println(ft);
    }
}
