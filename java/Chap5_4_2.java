public class Chap5_4_2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 100;

        while (num <= 100) {
            System.out.println(num);
            num++;
        }

        do {
            System.out.println(sum);
            sum --;
        } while (sum >= 1);
    }
}