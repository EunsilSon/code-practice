public class Hw2_Q4 {
    public static void main(String[] args) {
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