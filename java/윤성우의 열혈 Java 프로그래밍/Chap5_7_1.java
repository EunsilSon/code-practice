/*
구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을 작성하되, 2단은 2 X 2까지, 4단은 4 X 4까지, 6단은 6 X 6까지, 8단은 8 X 8까지 출력하도록 작성하자.
 */
public class Chap5_7_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            if ((i % 2) == 0) {    // 해당 되지 않는 단수 걸러내기
            for (int j = 1; j <= 9; j++) {

                if (i < j) {    // 단수와 곱할 수가 같지 않으면 반복 종료
                    break;
                }else
                    System.out.println(i + " X " + j + " = " + (i * j));
                }
                System.out.println(" ");
            }
        }
    }
}