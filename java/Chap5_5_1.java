public class Chap5_5_1 {
    public static void main(String[] args) {
        int sum = 1;

        for (int num = 1; num <= 10; num++) {
            sum *= num;
        }
        System.out.println(sum);
    }
}