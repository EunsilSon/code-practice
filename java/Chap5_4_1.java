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