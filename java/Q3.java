public class Q3 {
    public static void main(String arg[]) {
        int product = 5000;
        int money = 8000;
        int surtax = product / 10;
        int charge = money - product;

        System.out.println("부가세: " + surtax + " 잔돈: " + charge);
    }
}