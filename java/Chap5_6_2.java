public class Chap5_6_2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (true) {
            if ((num % 2) != 0) {
                sum += num;
            }
            if (sum > 1000) {
                System.out.println(num + "을 더했을 때 1000을 넘어섰음" + "\n" + "1000을 넘어선 값: " + sum);
                break;
            }
            num++;
        }
    }
}
