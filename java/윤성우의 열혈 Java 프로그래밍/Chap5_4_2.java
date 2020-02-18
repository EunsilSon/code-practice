/*
1부터 100까지 출력하고 이어서 거꾸로 100에서 1까지 출력하는 프로그램을 작성해보자.
단 가급적 while문과 do ~ while문을 한 번씩 사용해서 구현하자.
 */
public class Chap5_4_2 {
    public static void main(String[] args) {
        int n = 0;

        do {
            n++;
            System.out.print(n + " ");
        } while (n < 100);

        System.out.println("");

        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
    }
}