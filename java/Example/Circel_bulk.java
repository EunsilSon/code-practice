import java.util.Scanner;

public class Circel_bulk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("원의 반지름을 입력하시오: ");
		double rad = sc.nextDouble(); // 변수에 원의 반지름 저장
		
		double bulk = ((4 /3) * 3.14 * (rad * rad * rad)); // 원의 부피 계산
		
		System.out.println("원의 부피는: " + bulk);
	}
}