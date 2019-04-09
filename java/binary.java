public class binary {
    public static void main(String arg[]) {
        int num = 6;
        int binary = 0;
        int quo = 0;

        while (quo != 1) {
            quo = num / 2;
            binary = num % 2;
            num = quo;
            System.out.print(binary);
        }
        System.out.println(quo);
    }
}