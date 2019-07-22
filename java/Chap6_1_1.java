public class Chap6_1_1 {
    public static void main(String[] args) {
        calculate(5,10);
    }
    public static void calculate(int n1, int n2) {
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
        System.out.println(n1 + " ÷ " + n2 + " 의 몫: " + (n1 / n2));
        System.out.println(n1 + " ÷ " + n2 + " 의 나머지: " + (n1 % n2));
    }
}
