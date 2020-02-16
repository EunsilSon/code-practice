/*
예제 CondOp.java를 조건 연산자를 사용하고 않고 대신에 if ~ else문을 사용하는 형태로 수정해보자.
 */
public class Chap5_2 {
    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 100;

        if (num1 > num2) {
            System.out.println("큰 수 :" + num1);
        } else
            System.out.println("큰 수 :" + num2);

        if (num1 > num2) {
            System.out.println("절댓값 :" + (num1 - num2));
        } else
            System.out.println("절댓값 :" + (num2 - num1));
    }
}