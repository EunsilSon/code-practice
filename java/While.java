public class While {
    public static void main(String[] args) {
        int i = 1;
        int plus = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + "," + " ");
                plus += i;

            } else if (i / 2 == 10) {
                System.out.println(" ");

            } else if (i / 2 == 20) {
                System.out.println(" ");

            } else if (i / 2 == 30) {
                System.out.println(" ");

            } else if (i / 2 == 40) {
                System.out.println(" ");
            }
            i++;
        }
        System.out.println("\n" + "합은: " + plus);
    }
}

