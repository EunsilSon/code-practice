/*
switch문을 if~else문으로 바꿔보자.
*/
public class Chap5_3_1 {
    public static void main(String[] args) {
        int n = 3;

        if (n == 1) {
            System.out.println("Simple Java");
        } else if (n == 2) {
            System.out.println("Funny Java");
        } else if (n == 3) {
            System.out.println("Fantastic Java");
        } else
            System.out.println("The best programming language");

        System.out.println("Do you like Java?");
    }
}