public class For_Q3 {
    public static void main(String[] args) {
        /*
        "*"을 출력하여 다음과 같은 문양을 그려보자.
            *
           **
          ***
         ****
        *****
         */
        for (int a3 = 1; a3 <= 5; a3++) {
            for (int b2 = 1; b2 <= 5-a3; b2++) {
                System.out.print(" ");
            }
            for (int c2 = 1; c2 <= a3; c2++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
