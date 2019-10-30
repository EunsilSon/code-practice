public class For {
    public static void main(String[] args) {
        int money = 1;
        int result = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.println(i + "일: " + money + "원");
            result += money;
            money = money * 2;
        }
        System.out.println("총 합: " + result + "원");
    }
}