public class Hw1_Q3 {
    public static void main(String args[]) {
        /*
        4. 상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다.
        영수증에서는 10% 부가세와 잔돈 등이 나온다고 하자.
        구입한 상품의 가격과 손님한테 받은 금액을 정하면 부가세와 잔돈을 출력하는 코드를 작성해 보세요.
        ex) 받은 돈 10000 상품의 가격 7500 이라고하면 -> "부가세: 750 잔돈: 2500" 출력
        */
        int product = 5000;
        int money = 8000;
        int surtax = product / 10;
        int charge = money - product;

        System.out.println("부가세: " + surtax + " 잔돈: " + charge);
    }
}
