import java.util.Scanner;

public class Market {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("받은 돈: ");
		int consumer = sc.nextInt(); // 변수에 손님에게 받은 금액 저장
		
		System.out.print("상품의 총액: ");
		int total = sc.nextInt(); // 변수에 상품의 총액 저장
		
		int charge = consumer - total; // 거스름돈 계산
		int surtax = total / 10; // 부가세 계산
		
		System.out.println("부가세: " + surtax);
		System.out.println("잔돈: " + charge);
	}
}