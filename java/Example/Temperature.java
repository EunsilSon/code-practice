import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력하세요: ");
		double f = sc.nextDouble(); // 변수에 화씨 온도 저장
		
		double c = ((5.0 / 9.0) * (f - 32.0)); // 화씨 온도를 섭씨 온도로 환산
		
		System.out.println("섭씨 값은 " + c + "도입니다.");
	}
}