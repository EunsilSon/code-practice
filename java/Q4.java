public class Q4 {
    public static void main(String arg[]) {
        int number = 123;
        int num1 = 0;
        int num2 = 0;

        num1 = number / 10;
        num2 = num1 / 10;

        int num3 = num1 % 10;
        int num4 = number % 10;

        System.out.println(num4 + num2 + num3);
    }
}