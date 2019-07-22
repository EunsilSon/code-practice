/*
1부터 99까지의 합을 구하는 프로그램을 작성하되 while문을 이용해서 작성해보자.
 */
public class Chap5_4_1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 99) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}